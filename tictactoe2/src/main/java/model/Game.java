package model;

import constant.GameStatus;
import lombok.Builder;
import lombok.Getter;
import strategies.gamewinning.GameWinningStrategy;

import java.util.ArrayList;
import java.util.List;
@Getter
public class Game {
    private GameStatus gameStatus;
    private Player winner;
    private Integer currentTurn;
    private List<Player> players;
    private List<GameWinningStrategy> gameWinningStrategies;
    private List<Move> moves;

    private Game(){
        this.players = new ArrayList<>();
        this.gameWinningStrategies = new ArrayList<>();
        this.moves = new ArrayList<>();
    }

    public Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private List<Player> players;
        private List<GameWinningStrategy> gameWinningStrategies;
        private int dimension;
        public Builder(){
            this.players = new ArrayList<>();
            this.gameWinningStrategies = new ArrayList<>();
        }



    }
}
