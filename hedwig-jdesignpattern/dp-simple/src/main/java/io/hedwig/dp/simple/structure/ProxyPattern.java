package io.hedwig.dp.simple.structure;


import java.lang.annotation.*;

import io.hedwig.dp.simple.core.DP;
import io.hedwig.dp.simple.core.DPCategory;

/**
 * <b>Intent [GoF, pg 207]:</b> Provide a surrogate or placeholder for another
 * object to control access to it.
 * <p/>
 * <img src="http://www.jpatterns.org/uml/gof/ProxyStructure.gif"/>
 *
 * @author Heinz Kabutz
 * @since 2010-07-28
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD,
    ElementType.LOCAL_VARIABLE})
@Documented
@DP(type = DPCategory.STRUCTURAL,
    related = {AdapterPattern.class, DecoratorPattern.class})
public @interface ProxyPattern {
  Class[] participants() default {};

  String comment() default "";

  Variation variation() default Variation.STATIC_MANUAL;

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.TYPE)
  @Documented
  public @interface Subject {
    Class[] participants() default {};

    String comment() default "";
  }

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.TYPE)
  @Documented
  public @interface RealSubject {
    Class[] participants() default {};

    String comment() default "";
  }

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.TYPE)
  @Documented
  public @interface Proxy {
    Class[] participants() default {};

    String comment() default "";

    Variation variation() default Variation.STATIC_MANUAL;

    Type type() default Type.UNDEFINED;
  }

  @Retention(RetentionPolicy.RUNTIME)
  @Target({ElementType.TYPE, ElementType.FIELD,
      ElementType.LOCAL_VARIABLE})
  @Documented
  public @interface Client {
    Class[] participants() default {};

    String comment() default "";
  }

  public static enum Variation {
    STATIC_MANUAL, STATIC_GENERATED, DYNAMIC
  }

  public static enum Type {
    UNDEFINED, VIRTUAL, REMOTE, PROTECTION
  }
}
