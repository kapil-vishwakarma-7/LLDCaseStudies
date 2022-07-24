package strategies.botmakemove;

import model.Board;
import model.Move;
import model.Player;

public interface BotMakeMoveStrategy {
    public Move makeMove(Board board, Player player);
}
