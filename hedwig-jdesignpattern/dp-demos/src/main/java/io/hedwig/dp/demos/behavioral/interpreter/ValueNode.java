package io.hedwig.dp.demos.behavioral.interpreter;

public class ValueNode implements InterpreterNode {

  private int value;

  public ValueNode(int value) {
    this.value = value;
  }

  public int interpret() {
    return this.value;
  }
}