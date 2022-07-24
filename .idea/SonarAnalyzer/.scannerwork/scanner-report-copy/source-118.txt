package com.snakeandlader.startegy;

public class NormalButtonStrategy implements ButtonStartStrategy{
    @Override
    public boolean canStart(Integer val) {
        return val == 1 || val == 6;
    }
}
