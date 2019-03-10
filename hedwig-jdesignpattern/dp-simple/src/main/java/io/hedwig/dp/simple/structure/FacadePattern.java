package io.hedwig.dp.simple.structure;

import java.lang.annotation.*;

import io.hedwig.dp.simple.core.DP;
import io.hedwig.dp.simple.core.DPCategory;
import io.hedwig.dp.simple.behavior.MediatorPattern;
import io.hedwig.dp.simple.creations.AbstractFactoryPattern;
import io.hedwig.dp.simple.creations.SingletonPattern;

/**
 * <b>Intent [GoF, pg 185]:</b> Provide a unified interface to a set of interfaces in a subsystem.
 * Facade defines a higher-level interface that makes the subsystem easier to use.
 * <p/>
 * <img src="http://www.jpatterns.org/uml/gof/FacadeStructure.gif"/>
 *
 * @author Heinz Kabutz
 * @since 2010-07-28
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@DP(type = DPCategory.STRUCTURAL,
    related = {AbstractFactoryPattern.class, MediatorPattern.class,
               SingletonPattern.class})
public @interface FacadePattern {

  Class[] participants() default {};

  String comment() default "";
}
