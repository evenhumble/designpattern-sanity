package io.hedwig.dp.simple.core;

import java.lang.annotation.*;


/**
 * for design pattern name and category
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
@Documented
@Inherited
public @interface DP {

  Source source() default Source.GoF;

  DPCategory type();

  String[] urls() default {};

  Refactoring[] refactorings() default {};

  Class[] related() default {};
}
