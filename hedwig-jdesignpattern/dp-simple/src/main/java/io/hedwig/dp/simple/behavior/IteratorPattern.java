package io.hedwig.dp.simple.behavior;


import java.lang.annotation.*;

import io.hedwig.dp.core.DP;
import io.hedwig.dp.core.DPCategory;
import io.hedwig.dp.simple.creations.FactoryMethodPattern;
import io.hedwig.dp.simple.structure.CompositePattern;

/**
 * <b>Intent [GoF, pg 257]:</b> Provide a way to access the elements of an
 * aggregate object sequentially without exposing its underlying representation.
 * <p/>
 * <img src="http://www.jpatterns.org/uml/gof/IteratorStructure.gif"/>
 *
 * @author Heinz Kabutz
 * @since 2010-08-09
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@DP(type = DPCategory.BEHAVIORAL,
    related = {CompositePattern.class, FactoryMethodPattern.class,
               MementoPattern.class})
public @interface IteratorPattern {
  Class[] participants() default {};

  String comment() default "";

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.TYPE)
  @Documented
  public @interface Aggregate {
    Class[] participants() default {};

    String comment() default "";
  }

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.TYPE)
  @Documented
  public @interface Iterator {
    Class[] participants() default {};

    String comment() default "";
  }

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.TYPE)
  @Documented
  public @interface ConcreteAggregate {
    Class[] participants() default {};

    String comment() default "";
  }

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.TYPE)
  @Documented
  public @interface ConcreteIterator {
    Class[] participants() default {};

    String comment() default "";
  }
}
