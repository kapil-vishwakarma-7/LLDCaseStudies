package model;

import constant.PlayerType;

public class Human extends Player{
    private String email;
    public Human(String name, String email){
        super(name, PlayerType.HUMAN);
        this.email = email;
    }

    @Override
    public Move makeMove(Board board, Player player) {
        return null;
    }
}
