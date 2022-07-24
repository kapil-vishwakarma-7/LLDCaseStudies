package com.design.v3.entity;

public class Piegon extends Bird implements Flyable, Eatable{

    private FlyingBehaviour flyingBehaviour;

    public Piegon(FlyingBehaviour flyingBehaviour){
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
