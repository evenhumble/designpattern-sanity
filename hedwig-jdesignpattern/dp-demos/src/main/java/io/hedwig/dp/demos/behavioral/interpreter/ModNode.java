package io.hedwig.dp.demos.behavioral.interpreter;

public class ModNode extends SymbolNode {

  public ModNode(InterpreterNode left, InterpreterNode right) {
    super(left, right);
  }

  public int interpret() {
    return super.left.interpret() % super.right.interpret();
  }
}