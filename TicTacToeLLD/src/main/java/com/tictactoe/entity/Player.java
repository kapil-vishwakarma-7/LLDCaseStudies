package com.tictactoe.entity;

import com.tictactoe.strategy.MakeMoveStrategy;
import lombok.Getter;

@Getter
public abstract class Player {
    private String name;
    private Symbol symbol;
    private PlayerType playerType;

    public Player(String name, Symbol symbol, PlayerType playerType){
        this.name = name;
        this.symbol = symbol;
        this.playerType = playerType;
    }
}
