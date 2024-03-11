package com.demo.factory.UIFactory;

import com.demo.factory.Button;
import com.demo.factory.CheckBox;

public class Application {
    private Button button;
    private CheckBox checkBox;
    public Application(UIFactory uiFactory){
        button = uiFactory.createButton();
        checkBox = uiFactory.createCheckBox();
    }

    public void paint(){
        button.paint();
        checkBox.paint();
    }
}
