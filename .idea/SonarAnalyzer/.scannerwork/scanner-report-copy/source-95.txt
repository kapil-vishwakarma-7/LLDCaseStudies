package com.tictactoe.strategy;

import com.tictactoe.entity.Board;
import com.tictactoe.entity.Cell;
import com.tictactoe.entity.Player;

public interface MakeMoveStrategy {
    public Cell makeMove(Board board, Player player);
}
