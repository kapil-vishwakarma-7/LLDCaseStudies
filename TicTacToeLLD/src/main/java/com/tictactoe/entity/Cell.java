package com.tictactoe.entity;

import lombok.Getter;

@Getter
public class Cell {
    private Integer rowNumber;
    private Integer colNumber;
    private Symbol symbol;

    public Cell(Integer rowNumber, Integer colNumber, Symbol symbol) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.symbol = symbol;
    }

    public void setSymbol(Symbol symbol){
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        if(symbol == null){
            return ".";
        }
        return symbol.getCharacter().toString();
    }
}
