package io.hedwig.dp.demos.creation.abstractfactory.uilike;

/**
 * 1. author: patrick
 */
public class GSkinFactory implements SkinFactory {

  @Override
  public Button createButton() {
    return new RedButton();
  }

  @Override
  public TextField createTextField() {
    return new RedTextField();
  }

  @Override
  public ComboBox createComboBox() {
    return new RedComboBox();
  }
}
