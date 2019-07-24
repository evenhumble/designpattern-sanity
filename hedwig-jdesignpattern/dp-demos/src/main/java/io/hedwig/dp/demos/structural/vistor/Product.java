package io.hedwig.dp.demos.structural.vistor;

public interface Product {

  void accept(Visitor visitor);
}