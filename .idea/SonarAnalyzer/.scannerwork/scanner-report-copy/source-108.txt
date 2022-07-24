package model;

import constant.PlayerType;
import factory.BotMakeMoveFactory;

public abstract class Player {
    private String name;
    private PlayerType playerType;

    public Player(String name, PlayerType playerType){
        this.name = name;
        this.playerType = playerType;
    }

    public abstract Move makeMove(Board board, Player player);
}
