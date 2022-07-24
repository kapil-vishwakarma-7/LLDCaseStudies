package com.designpattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class BirdSantuary {

    public BirdSantuary() {

    }

    List<Bird> reproduce(List<Bird> parents){
        List<Bird> children = new ArrayList<>();
        for (Bird parent: parents){
            Bird child = parent.clone();
            children.add(child);
        }
        return children;
    }
}
