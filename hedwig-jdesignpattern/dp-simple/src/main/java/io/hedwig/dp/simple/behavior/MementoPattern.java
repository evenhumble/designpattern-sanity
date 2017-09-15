package io.hedwig.dp.simple.behavior;


import java.lang.annotation.*;

import io.hedwig.dp.core.DP;
import io.hedwig.dp.core.DPCategory;
import io.hedwig.dp.simple.structure.FacadePattern;

/**
 * <b>Intent [GoF, pg 283]:</b> Without violating encapsulation, capture and
 * externalize an object's internal state so that the object can be restored to
 * this state later.
 * <p/>
 * <img src="http://www.jpatterns.org/uml/gof/MementoStructure.gif"/>
 *
 * @author Heinz Kabutz
 * @since 2010-08-09
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@DP(type = DPCategory.BEHAVIORAL,
    related = {FacadePattern.class, ObserverPattern.class})
public @interface MementoPattern {
  Class[] participants() default {};

  String comment() default "";

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.TYPE)
  @Documented
  public @interface Originator {
    Class[] participants() default {};

    String comment() default "";
  }

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.TYPE)
  @Documented
  public @interface Memento {
    Class[] participants() default {};

    String comment() default "";
  }

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.TYPE)
  @Documented
  public @interface Caretaker {
    Class[] participants() default {};

    String comment() default "";
  }
}
