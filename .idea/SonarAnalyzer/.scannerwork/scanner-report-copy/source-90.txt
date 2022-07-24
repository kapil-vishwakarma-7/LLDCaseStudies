package com.tictactoe.exception;

public class InvalidBotDifficultyLevel extends Exception{
    public InvalidBotDifficultyLevel(){
        super("Invalid Bot Difficulty Level passed");
    }
}
