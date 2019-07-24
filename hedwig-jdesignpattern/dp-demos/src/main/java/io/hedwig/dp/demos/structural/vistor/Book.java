package io.hedwig.dp.demos.structural.vistor;

public class Book implements Product
{
  public void accept(Visitor visitor)
  {
      visitor.visit(this);
  }	
}