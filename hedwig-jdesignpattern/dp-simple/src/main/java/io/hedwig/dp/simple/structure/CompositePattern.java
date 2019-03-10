package io.hedwig.dp.simple.structure;

import java.lang.annotation.*;

import io.hedwig.dp.simple.core.DP;
import io.hedwig.dp.simple.core.DPCategory;
import io.hedwig.dp.simple.behavior.ChainOfResponsibilityPattern;
import io.hedwig.dp.simple.behavior.IteratorPattern;
import io.hedwig.dp.simple.behavior.VisitorPattern;

/**
 * <b>Intent [GoF, pg 163]:</b> Compose objects into tree structures to
 * represent whole-part hierarchies. Composite lets clients treat individual
 * objects and compositions of objects uniformly.
 * <p/>
 * <img src="http://www.jpatterns.org/uml/gof/CompositeStructure.gif"/>
 *
 * @author Heinz Kabutz
 * @since 2010-07-28
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@DP(type = DPCategory.STRUCTURAL,
    related = {ChainOfResponsibilityPattern.class, DecoratorPattern.class,
               FlyweightPattern.class, IteratorPattern.class, VisitorPattern.class})
public @interface CompositePattern {
  Class[] participants() default {};

  String comment() default "";

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.TYPE)
  @Documented
  public @interface Component {
    Class[] participants() default {};

    String comment() default "";
  }

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.TYPE)
  @Documented
  public @interface Leaf {
    Class[] participants() default {};

    String comment() default "";
  }

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.TYPE)
  @Documented
  public @interface Composite {
    Class[] participants() default {};

    String comment() default "";
  }
}
