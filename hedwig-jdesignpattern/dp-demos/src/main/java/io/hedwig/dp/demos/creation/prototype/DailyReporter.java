package io.hedwig.dp.demos.creation.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 1. author: patrick
 */
public class DailyReporter implements Cloneable, Serializable {

  private String name;
  private String date;
  private String content;
  private Attachment attachment = new Attachment();

  /**
   * 这个是浅拷贝，不会拷贝attachment
   */
  @Override
  protected DailyReporter clone() throws CloneNotSupportedException {
    DailyReporter o = null;
    try {
      o = (DailyReporter) super.clone();
    } catch (CloneNotSupportedException e) {
      System.out.println("Can't Clone for class " + this.getClass().getCanonicalName());
    }
    return o;

  }

  /**
   * need to be Serializable
   */
  public DailyReporter deepclone() throws Exception {

    ByteArrayOutputStream bao = new ByteArrayOutputStream();
    ObjectOutputStream oos = new ObjectOutputStream(bao);
    oos.writeObject(this);
    ByteArrayInputStream bai = new ByteArrayInputStream(bao.toByteArray());
    ObjectInputStream osi = new ObjectInputStream(bai);
    return (DailyReporter) osi.readObject();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  @Override
  public String toString() {
    return "DailyReporter{" +
           "name='" + name + '\'' +
           ", date='" + date + '\'' +
           ", content='" + content + '\'' +
           ", attachment=" + attachment +
           '}';
  }

  public Attachment getAttachment() {
    return attachment;
  }

  public void setAttachment(Attachment attachment) {
    this.attachment = attachment;
  }
}
