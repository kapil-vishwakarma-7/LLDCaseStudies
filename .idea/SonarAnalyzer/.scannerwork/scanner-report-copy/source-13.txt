package com.design.v3.entity;

public class Crow extends Bird implements Flyable, Eatable{
    FlyingBehaviour flyingBehaviour;

    public Crow(FlyingBehaviour flyingBehaviour){
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
