package com.snakeandlader.client;

import com.snakeandlader.model.Dice;
import com.snakeandlader.model.Game;
import com.snakeandlader.model.Player;

public class Client {
    public static void main(String[] args) {
        Game game = Game.builder()
                .addPlayer(new Player())
                .addPlayer(new Player())
                .buttonPerPlayer(1)
                .boardSize(100)
                .dice(new Dice(6))
                .build();

        game.getPlayers();
    }
}
