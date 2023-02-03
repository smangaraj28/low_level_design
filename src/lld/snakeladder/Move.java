package lld.snakeladder;

public abstract class Move {
    // int nextPosition
    // getNextCellPosition()
    public int nextPosition;

    public Move(int nextPosition) {
        this.nextPosition = nextPosition;
    }

    abstract boolean isValidPosition(int cellPosition);
}
