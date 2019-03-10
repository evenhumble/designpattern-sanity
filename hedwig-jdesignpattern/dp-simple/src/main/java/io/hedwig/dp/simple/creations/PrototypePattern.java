package io.hedwig.dp.simple.creations;


import java.lang.annotation.*;

import io.hedwig.dp.simple.core.DP;
import io.hedwig.dp.simple.core.DPCategory;
import io.hedwig.dp.simple.structure.CompositePattern;
import io.hedwig.dp.simple.structure.DecoratorPattern;

/**
 * <b>Intent [GoF, pg 117]:</b> Specify the kinds of objects to create using a prototypical
 * instance, and create new objects by copying this prototype.
 *
 * @author Heinz Kabutz
 * @since 2010-08-09
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@DP(type = DPCategory.CREATIONAL,
    related = {AbstractFactoryPattern.class, CompositePattern.class,
               DecoratorPattern.class})
public @interface PrototypePattern {

  Class[] participants() default {};

  String comment() default "";

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.TYPE)
  @Documented
  public @interface Prototype {

    Class[] participants() default {};

    String comment() default "";
  }

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.TYPE)
  @Documented
  public @interface ConcretePrototype {

    Class[] participants() default {};

    String comment() default "";
  }

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.METHOD)
  @Documented
  public @interface Operation {

    Class[] participants() default {};

    String comment() default "";
  }
}
