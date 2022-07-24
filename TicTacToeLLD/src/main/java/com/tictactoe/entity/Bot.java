package com.tictactoe.entity;

import com.tictactoe.factory.botMakeMoveFactory.BotMakeMoveFactory;
import com.tictactoe.strategy.MakeMoveStrategy;
import lombok.Getter;

@Getter
public class Bot extends Player{
    private DifficultyLevel difficultyLevel;
    private MakeMoveStrategy makeMoveStrategy;

    public Bot(String name, Symbol symbol, DifficultyLevel difficultyLevel){
        super(name, symbol, PlayerType.BOT);
        this.difficultyLevel = difficultyLevel;
        this.makeMoveStrategy = BotMakeMoveFactory.getRandomMakeMoveStrategy(difficultyLevel);
    }
}
