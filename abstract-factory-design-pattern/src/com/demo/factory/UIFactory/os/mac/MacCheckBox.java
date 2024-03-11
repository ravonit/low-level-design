package com.demo.factory.UIFactory.os.mac;

import com.demo.factory.CheckBox;

public class MacCheckBox implements CheckBox {
    @Override
    public void paint(){
        System.out.println("Mac OS CheckBox");
    }
}
