package com.snakeandlader.model;

import java.util.Map;

public class Board {
    private Integer dimension;
    private Map<Integer, ForeignEntity> foreignEntityMap;
    public Board(Integer dimension){
        this.dimension = dimension;
    }
}
