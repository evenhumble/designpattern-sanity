package io.hedwig.dp.demos.creation.prototype;

import java.io.Serializable;

/**
 * 1. author: patrick
 */
public class Attachment implements Serializable {
  private String name="init";
  private String content="for deep copy";

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  @Override
  public String toString() {
    return "Attachment{" +
           "name='" + name + '\'' +
           ", content='" + content + '\'' +
           '}';
  }
}
