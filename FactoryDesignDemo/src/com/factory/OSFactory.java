package com.factory;

public class OSFactory {
    public OSFactory() {
    }

    public OS getObjectInstance(String str){
        if(str.equals("Open")){
            return new Android();
        }
        else if(str.equals("Closed")){
            return new IOS();
        }
        else {
            return new Windows();
        }
    }
}
