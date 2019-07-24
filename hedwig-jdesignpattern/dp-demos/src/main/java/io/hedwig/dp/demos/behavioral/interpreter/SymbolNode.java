package io.hedwig.dp.demos.behavioral.interpreter;

public abstract class SymbolNode implements InterpreterNode {

  protected InterpreterNode left;
  protected InterpreterNode right;

  public SymbolNode(InterpreterNode left, InterpreterNode right) {
    this.left = left;
    this.right = right;
  }
}