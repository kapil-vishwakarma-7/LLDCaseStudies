package com.tictactoe.strategy;

import com.tictactoe.entity.Board;

public interface WinningStrategy {
    Boolean checkWin(Board board);
}
