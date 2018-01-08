package io.hedwig.dp.demos.structural.composite;

/**
 * 1. author: patrick
 */
public class Leaf extends Component {

  @Override
  public void operation() {
    System.out.println("operation "+this.getClass().getSimpleName());
  }

  @Override
  public void add(Component c) {
    System.out.println("add "+this.getClass().getSimpleName());
  }

  @Override
  public void remove(Component c) {
    System.out.println("remove "+this.getClass().getSimpleName());
  }

  @Override
  public void getChild(int index) {
    System.out.println("getChild "+this.getClass().getSimpleName());
  }
}
