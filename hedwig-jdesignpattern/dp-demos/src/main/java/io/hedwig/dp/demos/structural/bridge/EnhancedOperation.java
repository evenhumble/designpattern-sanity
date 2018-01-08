package io.hedwig.dp.demos.structural.bridge;

/**
 * 1. author: patrick
 */
public class EnhancedOperation extends AbstractOperation {

  @Override
  public void operation() {
    System.out.println("enhanced operation!");
    super.getImplementor().operationImpl();
  }
}
