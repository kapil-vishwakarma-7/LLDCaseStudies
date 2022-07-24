package com.tictactoe.factory.botMakeMoveFactory;

import com.tictactoe.entity.DifficultyLevel;
import com.tictactoe.exception.InvalidBotDifficultyLevel;
import com.tictactoe.strategy.EasyMakeMoveStrategy;
import com.tictactoe.strategy.MakeMoveStrategy;

public class BotMakeMoveFactory {
    public static MakeMoveStrategy getRandomMakeMoveStrategy(DifficultyLevel difficultyLevel)  {
        return switch (difficultyLevel){
            case EASY, MEDIUM, HARD,IMPOSSIBLE -> new EasyMakeMoveStrategy();
        };
    }
}
