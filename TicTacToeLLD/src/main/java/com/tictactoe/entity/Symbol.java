package com.tictactoe.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class Symbol {
    private Character character;

    public Symbol(Character character){
        this.character = character;
    }
}
