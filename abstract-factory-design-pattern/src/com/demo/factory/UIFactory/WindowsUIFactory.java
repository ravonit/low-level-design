package com.demo.factory.UIFactory;

import com.demo.factory.Button;
import com.demo.factory.CheckBox;
import com.demo.factory.UIFactory.os.win.WinButton;
import com.demo.factory.UIFactory.os.win.WinCheckBox;

public class WindowsUIFactory implements UIFactory{

    @Override
    public Button createButton(){
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox(){
        return new WinCheckBox();
    }
}
