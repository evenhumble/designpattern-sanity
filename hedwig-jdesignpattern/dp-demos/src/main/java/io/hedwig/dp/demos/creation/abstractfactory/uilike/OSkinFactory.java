package io.hedwig.dp.demos.creation.abstractfactory.uilike;

/**
 * 1. author: patrick
 */
public class OSkinFactory implements SkinFactory {

  @Override
  public Button createButton() {
    return new BlueButton();
  }

  @Override
  public TextField createTextField() {
    return new BlueTextField();
  }

  @Override
  public ComboBox createComboBox() {
    return new BlueComboBox();
  }
}
