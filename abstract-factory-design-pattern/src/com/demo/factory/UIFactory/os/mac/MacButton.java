package com.demo.factory.UIFactory.os.mac;

import com.demo.factory.Button;

public class MacButton implements Button {
    @Override
    public void paint(){
        System.out.println("Mac OS button");
    }
}
