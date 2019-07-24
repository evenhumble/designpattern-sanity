package io.hedwig.dp.demos.structural.template;

public class Client {

  public static void main(String a[]) {
    HookDemo hd;

    hd = new SubHookDemo();
    hd.process();
  }
}