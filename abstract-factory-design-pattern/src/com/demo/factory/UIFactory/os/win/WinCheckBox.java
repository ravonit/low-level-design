package com.demo.factory.UIFactory.os.win;

import com.demo.factory.CheckBox;

public class WinCheckBox implements CheckBox {
    @Override
    public void paint(){
        System.out.println("Windows OS CheckBox");
    }
}
