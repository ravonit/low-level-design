package com.demo.factory.UIFactory;

import com.demo.factory.Button;
import com.demo.factory.CheckBox;
import com.demo.factory.UIFactory.os.mac.MacButton;
import com.demo.factory.UIFactory.os.mac.MacCheckBox;

public class MacUIFactory implements UIFactory{

    @Override
    public Button createButton(){
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox(){
        return new MacCheckBox();
    }
}
