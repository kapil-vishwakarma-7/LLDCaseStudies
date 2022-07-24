package factory;

import constant.BotDifficultyLevel;
import exception.UndefinedBotDifficultyLevel;
import strategies.botmakemove.BotMakeMoveStrategy;
import strategies.botmakemove.BotRandomMakeMoveStrategy;

public class BotMakeMoveFactory {
    public BotMakeMoveStrategy getBotMakeMoveStrategy(BotDifficultyLevel difficultyLevel) {
        return switch (difficultyLevel){
            case EASY, MEDIUM, HARD -> new BotRandomMakeMoveStrategy();
        };
    }
}
