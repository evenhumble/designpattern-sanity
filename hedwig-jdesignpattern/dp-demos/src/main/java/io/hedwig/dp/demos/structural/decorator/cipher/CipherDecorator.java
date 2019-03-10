package io.hedwig.dp.demos.structural.decorator.cipher;

/**
 * @author: patrick on 2019-03-02
 * @Description:
 */
public class CipherDecorator implements Cipher {

  public CipherDecorator(Cipher cipher) {
    this.cipher = cipher;
  }

  private Cipher cipher;

  @Override
  public String encrypt(String plainText) {
    System.out.println("cipher decorator");
    return cipher.encrypt(plainText);
  }
}
