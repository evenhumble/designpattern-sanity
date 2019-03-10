package io.hedwig.dp.demos.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {

  private Object obj;

  public DynamicProxy() {
  }

  public DynamicProxy(Object obj) {
    this.obj = obj;
  }

  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    preRequest();
    method.invoke(obj, args);
    postRequest();
    return null;
  }

  public void preRequest() {
    System.out.println("pre-request");
  }

  public void postRequest() {
    System.out.println("post-request");
  }

}