package io.hedwig.dp.simple.behavior;

import java.lang.annotation.*;

import io.hedwig.dp.simple.core.DP;
import io.hedwig.dp.simple.core.DPCategory;
import io.hedwig.dp.simple.structure.FlyweightPattern;

/**
 * <b>Intent [GoF, pg 315]:</b> Define a family of algorithms, encapsulate each one, and make them
 * interchangeable. Strategy lets the algorithm vary independently from clients that use it.
 * <p/>
 * <img src="http://www.jpatterns.org/uml/gof/StrategyStructure.gif"/>
 *
 * @author Heinz Kabutz
 * @since 2010-07-28
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@DP(type = DPCategory.BEHAVIORAL,
    related = {FlyweightPattern.class})
public @interface StrategyPattern {

  Class[] participants() default {};

  String comment() default "";

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.TYPE)
  @Documented
  public @interface Context {

    Class[] participants() default {};

    String comment() default "";
  }

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.TYPE)
  @Documented
  public @interface Strategy {

    Class[] participants() default {};

    String comment() default "";
  }

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.FIELD)
  @Documented
  public @interface StrategyField {

    Class[] participants() default {};

    String comment() default "";
  }

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.TYPE)
  @Documented
  public @interface ConcreteStrategy {

    Class[] participants() default {};

    String comment() default "";
  }
}
