package io.hedwig.dp.simple.creations;


import io.hedwig.dp.core.DP;
import io.hedwig.dp.core.DPCategory;

import java.lang.annotation.*;

/**
 * <b>Intent [GoF, pg 107]:</b> Define an interface for creating an object, but
 * let subclasses decide which class to instantiate. Factory Method lets a class
 * defer instantiation to subclasses.
 * <p/>
 * This pattern refers to the GoF factory method, which differs greatly from the
 * static factory method commonly found in the refactoring literature.
 * <p/>
 * <img src="http://www.jpatterns.org/uml/gof/FactoryMethodStructure.gif"/>
 *
 * @author Heinz Kabutz
 * @since 2010-08-09
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@DP(type = DPCategory.CREATIONAL,
    related = {AbstractFactoryPattern.class, TemplateMethodPattern.class,
        PrototypePattern.class})
public @interface FactoryMethodPattern {
  Class[] participants() default {};

  String comment() default "";

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.TYPE)
  @Documented
  public @interface Creator {
    Class[] participants() default {};

    String comment() default "";
  }

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.TYPE)
  @Documented
  public @interface Product {
    Class[] participants() default {};

    String comment() default "";
  }

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.TYPE)
  @Documented
  public @interface ConcreteCreator {
    Class[] participants() default {};

    String comment() default "";
  }

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.TYPE)
  @Documented
  public @interface ConcreteProduct {
    Class[] participants() default {};

    String comment() default "";
  }
}
