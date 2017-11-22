package io.hedwig.dp.demos.creation.abstractfactory.uilike;

interface SkinFactory{
     Button createButton();
     TextField createTextField();
     ComboBox createComboBox();
}