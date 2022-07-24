package com.tictactoe.entity;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
@Getter
public class Board {
    private List<List<Cell>> cells;
    private Dimension dimension;
    public Board(Integer row, Integer col){
        this.dimension = new Dimension(row, col);
        this.createEmptyBoard();
    }

    private void createEmptyBoard(){
        this.cells = new ArrayList<>();
        for (Integer i=0; i < this.dimension.getRow(); i++){
            List<Cell> row = new ArrayList<>();
            for (Integer j=0; j < this.dimension.getCol(); j++){
                row.add(new Cell(i, j, new Symbol('.')));
            }
            cells.add(row);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (List<Cell> row: cells){
            sb.append(row.toString() + "\n");
        }
        return sb.toString();
    }
}
