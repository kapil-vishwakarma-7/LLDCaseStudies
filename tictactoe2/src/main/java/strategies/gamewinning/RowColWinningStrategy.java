package strategies.gamewinning;

import model.Board;
import model.Move;
import model.Player;

public class RowColWinningStrategy implements GameWinningStrategy{
    @Override
    public boolean checkWin(Board board, Move lastMove, Player player) {
        return false;
    }
}
