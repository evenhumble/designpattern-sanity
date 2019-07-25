package io.hedwig.dp.advanced.acyclicvisitor;

public abstract class Modem {
  public abstract void accept(ModemVisitor modemVisitor);
}
