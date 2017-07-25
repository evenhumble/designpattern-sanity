package io.hedwig.dp.core;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
@Documented
@Inherited
public @interface DesignPattern {
  Source source() default Source.GoF;

  Type type();

  String[] urls() default {};

  Refactoring[] refactorings() default {};

  Class[] related() default {};
}