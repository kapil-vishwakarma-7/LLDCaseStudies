package com.tictactoe.client;

import com.tictactoe.entity.*;
import com.tictactoe.strategy.ColumnWinningStrategy;
import com.tictactoe.strategy.DiagonalWinningStrategy;
import com.tictactoe.strategy.EasyMakeMoveStrategy;
import com.tictactoe.strategy.RowWinningStrategy;

import javax.management.OperationsException;

public class PlayGame {
    public static void main(String[] args) throws OperationsException {
        Player kapil = new Human("k@tictac.com", "kapil", new Symbol('O'));
        Player inteliJBot = new Bot("Intelij-Bot", new Symbol('X'), DifficultyLevel.EASY);

        Game game = Game.builder()
                .board(new Board(3, 3))
                .addWinningStrategy(new ColumnWinningStrategy())
                .addWinningStrategy(new RowWinningStrategy())
                .addWinningStrategy(new DiagonalWinningStrategy())
                .addPlayer(kapil)
                .addPlayer(inteliJBot)
                .build();

        game.makeMove(kapil, 0, 0);
        game.makeMove(inteliJBot, 1, 2);
        game.makeMove(kapil, 0, 1);
        game.makeMove(inteliJBot, 2,2);
        game.makeMove(kapil, 0,2);
        System.out.println(game.getBoard().toString());
    }

}
