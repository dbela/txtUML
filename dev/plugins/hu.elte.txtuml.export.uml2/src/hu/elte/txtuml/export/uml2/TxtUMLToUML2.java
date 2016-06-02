package hu.elte.txtuml.export.uml2;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.stream.Stream;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;

import hu.elte.txtuml.export.uml2.mapping.ModelMapCollector;
import hu.elte.txtuml.export.uml2.mapping.ModelMapException;
import hu.elte.txtuml.export.uml2.structural.ModelExporter;
import hu.elte.txtuml.utils.eclipse.NotFoundException;
import hu.elte.txtuml.utils.eclipse.PackageUtils;
import hu.elte.txtuml.utils.eclipse.ProjectUtils;

/**
 * This class is responsible for exporting Eclipse UML2 model generated from a
 * txtUML model.
 */
public class TxtUMLToUML2 {

	/**
	 * Exports the txtUML model to a org.eclipse.uml2.uml.Model representation
	 * 
	 * @param sourceProject
	 *            name of the source project, where the txtUML model can be find
	 * @param packageName
	 *            fully qualified name of the txtUML model
	 * @param outputDirectory
	 *            where the result model should be saved
	 */
	public static Model exportModel(String sourceProject, String packageName, String outputDirectory,
			ExportMode exportMode) throws JavaModelException, NotFoundException, IOException {
		return exportModel(sourceProject, packageName, URI.createPlatformResourceURI(outputDirectory, false),
				exportMode);
	}

	/**
	 * Exports the txtUML model to a org.eclipse.uml2.uml.Model representation
	 * 
	 * @param sourceProject
	 *            name of the source project, where the txtUML model can be find
	 * @param packageName
	 *            fully qualified name of the txtUML model
	 * @param outputDirectory
	 *            where the result model should be saved
	 */
	public static Model exportModel(String sourceProject, String packageName, URI outputDirectory,
			ExportMode exportMode) throws NotFoundException, JavaModelException, IOException {

		Model model = exportModel(sourceProject, packageName, exportMode);

		File file = new File(model.eResource().getURI().toFileString());
		file.getParentFile().mkdirs();
		model.eResource().save(null);

		IFile createdFile = ResourcesPlugin.getWorkspace().getRoot().findFilesForLocationURI(file.toURI())[0];
		try {
			createdFile.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		} catch (CoreException e) {
			throw new RuntimeException(e);
		}

		IFileStore fileStore = EFS.getLocalFileSystem().getStore(file.toURI());
		if (PlatformUI.isWorkbenchRunning()) {
			IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			try {
				IDE.openEditorOnFileStore(page, fileStore);
			} catch (PartInitException e) {
				throw new RuntimeException(e);
			}
		}

		return model;
	}

	public static Model exportModel(String sourceProject, String packageName, ExportMode exportMode)
			throws NotFoundException, JavaModelException {
		IJavaProject javaProject = ProjectUtils.findJavaProject(sourceProject);

		IPackageFragment[] packageFragments = PackageUtils.findPackageFragments(javaProject, packageName);

		if (packageFragments.length == 0) {
			throw new NotFoundException("Cannot find package '" + packageName + "'");
		}

		IPackageFragment fragment = null;
		for (IPackageFragment pf : packageFragments) {
			boolean isModel = Stream.of(pf.getCompilationUnits())
					.anyMatch(cu -> cu.getElementName().equals(PackageUtils.PACKAGE_INFO));
			if (isModel) {
				fragment = pf;
			}
		}

		ModelExporter modelExporter = new ModelExporter(exportMode);
		Model model = modelExporter.export(fragment);

		ExporterCache cache = modelExporter.cache;

		Set<Element> unrooted = cache.floatingElements();
		if (exportMode.isErrorHandler()) {
			unrooted.forEach(e -> e.destroy());
		} else if(!unrooted.isEmpty()) {
			throw new IllegalStateException("Unrooted elements found in the exported model: " + unrooted);
		}
		ModelMapCollector collector = new ModelMapCollector(model.eResource().getURI());
		cache.getMapping().forEach((s, e) -> collector.put(s, e));
		try {
			URI destination = URI.createFileURI(fragment.getJavaProject().getProject().getLocation().toOSString())
					.appendSegment("gen");
			String fileName = fragment.getElementName();
			collector.save(destination, fileName);
		} catch (ModelMapException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return model;
	}

	public static Model loadExportedModel(String uri) throws WrappedException {
		return loadExportedModel(URI.createPlatformResourceURI(uri, false));

	}

	public static Model loadExportedModel(URI uri) throws WrappedException {
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(uri, true);
		Model model = null;
		if (resource.getContents().size() != 0)
			model = (Model) resource.getContents().get(0);
		return model;
	}

}