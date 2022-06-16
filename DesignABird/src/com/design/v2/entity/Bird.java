package com.design.v2.entity;

public abstract class Bird {
    protected double weight;
    protected String color;
    protected String type;
    protected String bokeType;
    protected void eat(){

    }
    protected void sleep(){

    }
    abstract protected void makeSound();
    abstract protected void fly();
}
