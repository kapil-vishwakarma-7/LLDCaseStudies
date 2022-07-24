package model;

import constant.GameStatus;
import lombok.Getter;
import strategies.gamewinning.GameWinningStrategy;

import java.util.List;

@Getter
public class Board {
    private List<List<Cell>> cells;

}
