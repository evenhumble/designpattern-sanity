package io.hedwig.dp.simple.structure;


import java.lang.annotation.*;

import io.hedwig.dp.core.DP;
import io.hedwig.dp.core.DPCategory;
import io.hedwig.dp.simple.creations.AbstractFactoryPattern;

/**
 * <b>Intent [GoF, pg 151]:</b> Decouple an abstraction from its implementation
 * so that the two can vary independently.
 * <p/>
 * <img src="http://www.jpatterns.org/uml/gof/BridgeStructure.gif"/>
 *
 * @author Heinz Kabutz
 * @since 2010-07-28
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@DP(type = DPCategory.STRUCTURAL,
    related = {AbstractFactoryPattern.class, AdapterPattern.class})
public @interface BridgePattern {
  Class[] participants() default {};

  String comment() default "";

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.TYPE)
  @Documented
  public @interface Abstraction {
    Class[] participants() default {};

    String comment() default "";
  }

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.TYPE)
  @Documented
  public @interface RefinedAbstraction {
    Class[] participants() default {};

    String comment() default "";
  }

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.TYPE)
  @Documented
  public @interface Implementor {
    Class[] participants() default {};

    String comment() default "";
  }

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.TYPE)
  @Documented
  public @interface ConcreteImplementor {
    Class[] participants() default {};

    String comment() default "";
  }
}
