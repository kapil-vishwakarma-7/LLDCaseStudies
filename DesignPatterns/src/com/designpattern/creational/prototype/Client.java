package com.designpattern.creational.prototype;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Bird> parents = List.of(
          new Sparrow(),
          new Crow(),
          new Sparrow()
        );
        BirdSantuary birdSantuary = new BirdSantuary();
        List<Bird> children = birdSantuary.reproduce(parents);
        System.out.println(children);
    }
}
