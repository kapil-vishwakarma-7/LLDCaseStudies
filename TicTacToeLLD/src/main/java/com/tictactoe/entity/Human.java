package com.tictactoe.entity;

import lombok.Getter;

@Getter
public class Human extends Player{
    private String email;
    public Human(String email, String name, Symbol symbol){
        super(name, symbol, PlayerType.HUMAN);
        this.email = email;
    }
}
