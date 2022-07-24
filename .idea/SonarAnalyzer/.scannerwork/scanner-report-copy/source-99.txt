package strategies.gamewinning;

import model.Board;
import model.Move;
import model.Player;

public interface GameWinningStrategy {
    public boolean checkWin(Board board, Move lastMove, Player player);
}
