package com.demo.factory.UIFactory.os.win;

import com.demo.factory.Button;

public class WinButton implements Button {
    @Override
    public void paint(){
        System.out.println("Windows OS button");
    }
}
