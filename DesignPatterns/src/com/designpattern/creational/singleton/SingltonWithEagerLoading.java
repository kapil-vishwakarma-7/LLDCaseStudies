package com.designpattern.creational.singleton;

public class SingltonWithEagerLoading {
    private static SingltonWithEagerLoading object = new SingltonWithEagerLoading();

    private SingltonWithEagerLoading(){}

    public static SingltonWithEagerLoading getInstance(){
        return object;
    }
}
