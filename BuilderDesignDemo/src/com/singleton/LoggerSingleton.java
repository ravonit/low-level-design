package com.singleton;

public class LoggerSingleton {

    private static volatile LoggerSingleton LOGGER = null;

    private LoggerSingleton(){
        if(LOGGER != null){
            throw new RuntimeException("Private constructor, can't be accessed using reflection");
        }
    }
    public static LoggerSingleton getLogger(){
        if(LOGGER == null){
            synchronized (LoggerSingleton.class){
                if(LOGGER == null){
                    LOGGER = new LoggerSingleton();
                }
            }
        }
        return LOGGER;
    }

//    private LoggerSingleton(){
//    }
    //Eager loading
//    private static final LoggerSingleton LOGGER = new LoggerSingleton();
//    public static LoggerSingleton getLogger(){
//        return LOGGER;
//    }

    //Lazy loading
//    private static LoggerSingleton LOGGER = null;
//
//    public static LoggerSingleton getLogger(){
//        if(LOGGER == null){
//            LOGGER = new LoggerSingleton();
//        }
//        return LOGGER;
//    }
}
