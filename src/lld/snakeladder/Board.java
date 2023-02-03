package lld.snakeladder;

import java.util.List;
import java.util.Optional;

public class Board {
    // List<Cell> cells
    // moveToNextPosition( int curPos, int diceNumber )
    private List<Cell> cells;

    public Board(List<Cell> cells) {
        this.cells = cells;
    }

    public List<Cell> getCells() {
        return cells;
    }

    public void setCells(List<Cell> cells) {
        this.cells = cells;
    }


    public int moveToNextPosition(int playerCurrentPos, int diceNumber) {
        int playerNextPos = playerCurrentPos + diceNumber;
        Optional<Cell> playerNextCell = getNextCellByPosition(playerNextPos);
        return playerNextCell.map(Cell::nextPosition).orElse(playerCurrentPos);
    }

    private Optional<Cell> getNextCellByPosition(int position) {
        return cells.stream().filter(cell -> cell.getPosition() == position).findFirst();
    }
}
