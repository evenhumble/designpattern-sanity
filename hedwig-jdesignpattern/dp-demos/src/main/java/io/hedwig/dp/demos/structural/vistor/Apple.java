package io.hedwig.dp.demos.structural.vistor;

public class Apple implements Product
{
  public void accept(Visitor visitor)
  {
      visitor.visit(this);
  }	
}