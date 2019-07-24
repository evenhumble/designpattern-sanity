package io.hedwig.dp.demos.structural.vistor;

public class Saler extends Visitor {

  public void visit(Apple apple) {
    System.out.println("this is Apple....");
  }

  public void visit(Book book) {
    System.out.println("this is book.....");
  }
}