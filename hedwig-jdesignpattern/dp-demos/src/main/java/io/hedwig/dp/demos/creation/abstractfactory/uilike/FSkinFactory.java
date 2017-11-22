package io.hedwig.dp.demos.creation.abstractfactory.uilike;

/**
 * 1. author: patrick
 */
public class FSkinFactory implements SkinFactory {

  @Override
  public Button createButton() {
    return new YellowButton();
  }

  @Override
  public TextField createTextField() {
    return new YellowTextField();
  }

  @Override
  public ComboBox createComboBox() {
    return new YellowComboBox();
  }
}
