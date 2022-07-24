package com.designpattern.creational.prototype;

public class Crow extends Bird{
    private String sound = "Kaw";

    public Crow(){}

    public Crow(Crow old){
        super(old);
        old.sound = this.sound;
    }
    @Override
    public Bird clone() {
        return new Crow(this);
    }
}
