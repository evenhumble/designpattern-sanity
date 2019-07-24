package io.hedwig.dp.demos.behavioral.interpreter;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: patrick on 2019-07-24
 * @Description:
 */
public class CalIterpreter {

  private String statement;
  private InterpreterNode node;
  private static Map<String, Class> handlerClassMap = new ConcurrentHashMap<>();

  static {
    handlerClassMap.put("*", MulNode.class);
    handlerClassMap.put("/", DivNode.class);
    handlerClassMap.put("%", ModNode.class);
  }

  public void build(String statement)
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InstantiationException {
    InterpreterNode left = null, right = null;
    Stack stack = new Stack();
    String[] statementAddr = statement.split(" ");
    for (int i = 0; i < statementAddr.length; i++) {
      Class handleClass = handlerClassMap.get(statementAddr[i]);
      if (handleClass != null) {
        left = (InterpreterNode) stack.pop();
        int val = Integer.parseInt(statementAddr[++i]);
        right = new ValueNode(val);

        Constructor c = handleClass.getConstructor(String.class, String.class);
        stack.push(c.newInstance(left, right));

      }
    }
    this.node = (InterpreterNode) stack.pop();
  }

  public int compute() {
    return node.interpret();
  }
}
