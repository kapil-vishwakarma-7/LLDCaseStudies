package com.designpattern.creational.singleton;

public class Singleton {
    private static Singleton object;

    private Singleton(){

    }
    public static Singleton getInstance() {
        if(object == null){
            synchronized (Singleton.class){
                if (object == null){
                    object = new Singleton();
                }
            }
        }
        object.hashCode();
        return object;
    }
}
