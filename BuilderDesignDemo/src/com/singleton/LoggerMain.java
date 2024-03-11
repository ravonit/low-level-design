package com.singleton;

public class LoggerMain {
    public static void main(String[] args){
        LoggerSingleton loggerSingleton1 = LoggerSingleton.getLogger();
        System.out.println(loggerSingleton1);
        LoggerSingleton loggerSingleton2 = LoggerSingleton.getLogger();
        System.out.println(loggerSingleton2);
    }
}
