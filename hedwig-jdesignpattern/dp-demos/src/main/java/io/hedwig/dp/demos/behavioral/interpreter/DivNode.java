package io.hedwig.dp.demos.behavioral.interpreter;

public class DivNode extends SymbolNode {

  public DivNode(InterpreterNode left, InterpreterNode right) {
    super(left, right);
  }

  public int interpret() {
    return super.left.interpret() / super.right.interpret();
  }
}