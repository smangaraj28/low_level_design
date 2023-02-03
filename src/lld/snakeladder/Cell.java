package lld.snakeladder;

public class Cell {
    // position
    // Move move
    // operation
    private int position;
    private Move move;

    public Cell(int position, Move move) {
        this.position = position;
        this.move = move;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int nextPosition() {
        return 1;
    }
}
