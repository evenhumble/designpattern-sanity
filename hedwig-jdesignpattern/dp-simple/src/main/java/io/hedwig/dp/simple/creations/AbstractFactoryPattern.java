package io.hedwig.dp.simple.creations;



import java.lang.annotation.*;

import io.hedwig.dp.core.DP;
import io.hedwig.dp.core.DPCategory;
import io.hedwig.dp.simple.creations.FactoryMethodPattern;

/**
 * <b>Intent [GoF, pg 87]:</b> Provide an interface for creating families of
 * related or dependent objects without specifying their concrete classes.
 * <p/>
 * <img src="http://www.jpatterns.org/uml/gof/AbstractFactoryStructure.gif"/>
 * <p/>
 * <img src="http://www.jpatterns.org/uml/gof/AbstractFactoryUserViewStructure.gif"/>
 *
 * @author Heinz Kabutz, Michael Hunger
 * @since 2010-08-09
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@DP(type = DPCategory.CREATIONAL,
    related = {FactoryMethodPattern.class, PrototypePattern.class,
               SingletonPattern.class})
public @interface AbstractFactoryPattern {
  Class[] participants() default {};

  String comment() default "";

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.TYPE)
  @Documented
  public @interface AbstractProduct {
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

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.METHOD)
  @Documented
  public @interface FactoryMethod {
    Class[] participants() default {};

    String comment() default "";
  }

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.TYPE)
  @Documented
  public @interface AbstractFactory {
    Class[] participants() default {};

    String comment() default "";
  }

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.TYPE)
  @Documented
  public @interface ConcreteFactory {
    Class[] participants() default {};

    String comment() default "";
  }
} 
