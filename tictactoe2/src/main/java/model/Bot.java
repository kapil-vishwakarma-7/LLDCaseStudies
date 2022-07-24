package model;

import constant.BotDifficultyLevel;
import constant.PlayerType;
import factory.BotMakeMoveFactory;
import strategies.botmakemove.BotMakeMoveStrategy;
import strategies.botmakemove.BotRandomMakeMoveStrategy;

public class Bot extends Player {
    private BotDifficultyLevel difficultyLevel;
    private BotMakeMoveStrategy botMakeMoveStrategy;
    private BotMakeMoveFactory botMakeMoveFactory = new BotMakeMoveFactory();

    public Bot(String name, BotDifficultyLevel difficultyLevel){
        super(name, PlayerType.BOT);
        this.difficultyLevel = difficultyLevel;
        this.botMakeMoveStrategy = botMakeMoveFactory.getBotMakeMoveStrategy(difficultyLevel);
    }

    @Override
    public Move makeMove(Board board, Player player) {
        return this.botMakeMoveStrategy.makeMove(board, player);
    }
}
