package io.hedwig.dp.demos.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. author: patrick
 */
public class Composite extends Component {
  private List<Component> componentList = new ArrayList<>();

  @Override
  public void operation() {
    for (Component component : componentList) {
      component.operation();
      System.out.println("operation "+this.getClass().getSimpleName());
    }

  }

  @Override
  public void add(Component c) {
    this.componentList.add(c);
    System.out.println("add "+this.getClass().getSimpleName());
  }

  @Override
  public void remove(Component c) {
    componentList.remove(c);
    System.out.println("remove "+this.getClass().getSimpleName());
  }

  @Override
  public void getChild(int index) {
    componentList.get(index);
    System.out.println("getChild "+this.getClass().getSimpleName());
  }
}
