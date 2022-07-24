package com.tictactoe.strategy;

import com.tictactoe.entity.Board;
import com.tictactoe.entity.Cell;
import com.tictactoe.entity.Symbol;

import java.util.List;

public class RowWinningStrategy implements WinningStrategy{
    @Override
    public Boolean checkWin(Board board) {
        for (int i=0; i < board.getCells().size(); i++){
            List<Cell> row = board.getCells().get(i);
            boolean flag = false;
            for(int j=0; j<row.size()-1; j++){
                if( row.get(j).getSymbol().getCharacter().equals('.') ){
                    flag = true;
                }

                if(!row.get(j).getSymbol().getCharacter().equals(row.get(j+1).getSymbol().getCharacter())){
                    flag = true;
                }

                if( flag==false ){
                    return true;
                }
            }
        }
        return false;
    }
}
