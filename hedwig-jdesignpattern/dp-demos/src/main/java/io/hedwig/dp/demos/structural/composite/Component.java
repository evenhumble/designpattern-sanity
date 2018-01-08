package io.hedwig.dp.demos.structural.composite;

/**
 * 1. author: patrick
 */
public abstract class Component {
    public abstract void operation();
    public abstract void add(Component c);
    public abstract void remove(Component c);
    public abstract void getChild(int index);
}
