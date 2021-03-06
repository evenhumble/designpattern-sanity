package io.hedwig.dp.simple.behavior;


import java.lang.annotation.*;

import io.hedwig.dp.simple.core.DP;
import io.hedwig.dp.simple.core.DPCategory;
import io.hedwig.dp.simple.core.Refactoring;
import io.hedwig.dp.simple.core.Source;
import io.hedwig.dp.simple.creations.PrototypePattern;
import io.hedwig.dp.simple.structure.CompositePattern;

/**
 * <b>Intent [GoF, pg 233]:</b> Encapsulate a request as an object, thereby letting you parameterize
 * clients with different requests, queue or log requests, and support undoable operations.
 * <p/>
 * <img src="http://www.jpatterns.org/uml/gof/CommandStructure.gif"/>
 *
 * @author Michael Hunger
 * @since 2010-08-08
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@DP(type = DPCategory.BEHAVIORAL, source = Source.GoF,
    urls = {"http://en.wikipedia.org/wiki/Command_pattern",
            "http://home.earthlink.net/~huston2/dp/command.html"},
    refactorings = {
        Refactoring.ExtractParameterObject,
        Refactoring.ExtractMethodObject},
    related = {CompositePattern.class, MementoPattern.class,
               PrototypePattern.class})

public @interface CommandPattern {

  Class[] participants() default {};

  String comment() default "";

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.TYPE)
  @Documented
  public @interface Command {

    Class[] participants() default {};

    String comment() default "";

    boolean undoable() default false;
  }

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.TYPE)
  @Documented
  public @interface ConcreteCommand {

    Class[] participants() default {};

    String comment() default "";
  }

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.TYPE)
  @Documented
  public @interface Invoker {

    Class[] participants() default {};

    String comment() default "";
  }

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.TYPE)
  @Documented
  public @interface Receiver {

    Class[] participants() default {};

    String comment() default "";
  }

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.TYPE)
  @Documented
  public @interface Client {

    Class[] participants() default {};

    String comment() default "";
  }
}
