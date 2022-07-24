package com.tictactoe.strategy;

import com.tictactoe.entity.Board;

public class ColumnWinningStrategy implements WinningStrategy{
    @Override
    public Boolean checkWin(Board board) {
        return false;
    }
}
