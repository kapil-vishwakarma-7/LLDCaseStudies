package model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Cell {
    private Integer row;
    private Integer col;
    private Symbol symbol;
}
