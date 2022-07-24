package com.tictactoe.entity;

import com.tictactoe.strategy.WinningStrategy;
import lombok.Getter;

import javax.management.OperationsException;
import java.util.ArrayList;
import java.util.List;

@Getter
public class Game {
    private Board board;
    private List<Player> players;
    private List<WinningStrategy> winningStrategies;
    private Integer currentTurn;

    private Game(Board board, List<Player> players, List<WinningStrategy> winningStrategies, Integer currentTurn){
        this.board = board;
        this.players = players;
        this.winningStrategies = winningStrategies;
        this.currentTurn = currentTurn;
    }

    public Boolean isWon(){
        for (WinningStrategy strategy: winningStrategies) {
            if(strategy.checkWin(board)){
                return true;
            }
        }
        return false;
    }

    public void makeMove(Player player, Integer row, Integer col) throws OperationsException {
        if (players.get(currentTurn).equals(player)){
            Cell cell = this.getBoard().getCells().get(row).get(col);
            cell.setSymbol(player.getSymbol());
            this.checkWinner();
            currentTurn = (currentTurn + 1) % players.size();
        } else {
            throw new OperationsException("Making move with wrong player");
        }
    }

    private void checkWinner(){
//        System.out.println("Checking Winner.");
        for(WinningStrategy strategy : winningStrategies){
            if(strategy.checkWin(this.getBoard())){
                System.out.println(players.get(currentTurn) + " Won the game!!");
            }
        }
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private Board board;
        private List<Player> players = new ArrayList<>();
        private List<WinningStrategy> winningStrategies = new ArrayList<>();

        public Builder board(Board board){
            this.board = board;
            return this;
        }

        public Builder addPlayer(Player player){
            this.players.add(player);
            return this;
        }

        public Builder addWinningStrategy(WinningStrategy strategy){
            this.winningStrategies.add(strategy);
            return this;
        }
        public Game build(){
            return new Game(this.board, this.players, this.winningStrategies, 0);
        }
    }
}
