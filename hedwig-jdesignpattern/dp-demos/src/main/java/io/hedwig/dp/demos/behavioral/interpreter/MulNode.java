package io.hedwig.dp.demos.behavioral.interpreter;

public class MulNode extends SymbolNode {

  public MulNode(InterpreterNode left, InterpreterNode right) {
    super(left, right);
  }

  public int interpret() {
    return super.left.interpret() * super.right.interpret();
  }
}