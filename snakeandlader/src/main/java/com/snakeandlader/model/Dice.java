package com.snakeandlader.model;

import java.security.SecureRandom;

public class Dice {
    private Integer maxNumer;
    private SecureRandom random = new SecureRandom();

    public Dice(final Integer maxNumer){
        this.maxNumer = maxNumer;
    }

    public Integer roll(){
        return random.nextInt(maxNumer);
    }
}
