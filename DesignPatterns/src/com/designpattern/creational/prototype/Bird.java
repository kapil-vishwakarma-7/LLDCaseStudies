package com.designpattern.creational.prototype;

/**
 * The prototype design pattern is needed when you want to create copy of object.
 *
 *
 *
 * */
public abstract class Bird implements Cloneable<Bird>{
    private String name;
    private String color;
    private int weight;


    public Bird(Bird old) {
        old.color = this.color;
        old.name = this.name;
        old.weight = this.weight;
    }

    public Bird(String name, String color, int weight){
        this.weight = weight;
        this.name = name;
        this.color = color;
    }

    public Bird(){}

    @Override
    public abstract Bird clone();
}
