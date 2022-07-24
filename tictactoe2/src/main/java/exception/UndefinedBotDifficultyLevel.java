package exception;

public class UndefinedBotDifficultyLevel extends Exception{
    public UndefinedBotDifficultyLevel(){
        super("Bot Difficulty Level is Undefined.");
    }
}
