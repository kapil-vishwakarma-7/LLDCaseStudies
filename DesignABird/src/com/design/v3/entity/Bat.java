package com.design.v3.entity;

public class Bat extends Bird implements Flyable, Eatable{
    private FlyingBehaviour flyingBehaviour;

    public Bat(FlyingBehaviour flyingBehaviour){
        this.flyingBehaviour = flyingBehaviour;
    }

    @Override
    public void eat() {

    }

    @Override
    public void fly() {
        this.flyingBehaviour.fly();
    }
}
