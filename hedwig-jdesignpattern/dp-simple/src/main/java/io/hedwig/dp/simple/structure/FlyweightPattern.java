package io.hedwig.dp.simple.structure;

import java.lang.annotation.*;

import io.hedwig.dp.core.DP;
import io.hedwig.dp.core.DPCategory;
import io.hedwig.dp.simple.behavior.StatePattern;
import io.hedwig.dp.simple.behavior.StrategyPattern;

/**
 * <b>Intent [GoF, pg 195]:</b> Use sharing to support large numbers of fine-grained objects
 * efficiently.
 * <p/>
 * <img src="http://www.jpatterns.org/uml/gof/FlyweightStructure.gif"/>
 *
 * @author Heinz Kabutz
 * @since 2010-07-28
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@DP(type = DPCategory.STRUCTURAL,
    related = {CompositePattern.class, StatePattern.class,
               StrategyPattern.class})
public @interface FlyweightPattern {

  Class[] participants() default {};

  String comment() default "";

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.TYPE)
  @Documented
  public @interface FlyweightFactory {

    Class[] participants() default {};

    String comment() default "";
  }

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.TYPE)
  @Documented
  public @interface Flyweight {

    Class[] participants() default {};

    String comment() default "";
  }

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.TYPE)
  @Documented
  public @interface UnsharedConcreteFlyweight {

    Class[] participants() default {};

    String comment() default "";
  }

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.TYPE)
  @Documented
  public @interface ConcreteFlyweight {

    Class[] participants() default {};

    String comment() default "";
  }
}
