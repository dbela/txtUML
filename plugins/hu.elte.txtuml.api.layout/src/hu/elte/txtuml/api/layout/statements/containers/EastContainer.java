package hu.elte.txtuml.api.layout.statements.containers;

import hu.elte.txtuml.api.layout.statements.East;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The container for repeatable annotation {@link East}.
 * 
 * @author Gabor Ferenc Kovacs
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface EastContainer {
	East[] value() default {};
}