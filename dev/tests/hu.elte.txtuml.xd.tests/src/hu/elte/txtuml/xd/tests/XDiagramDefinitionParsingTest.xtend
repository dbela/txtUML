/*
 * generated by Xtext 2.10.0
 */
package hu.elte.txtuml.xd.tests

import com.google.inject.Inject
import hu.elte.txtuml.xd.xDiagramDefinition.Model
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(XDiagramDefinitionInjectorProvider)
class XDiagramDefinitionParsingTest{

	@Inject
	ParseHelper<Model> parseHelper

	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
	}

}