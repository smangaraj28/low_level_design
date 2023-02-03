package lld.snakeladder;

public class BlackSnake extends Move {

    public BlackSnake(int nextPosition) {
        super(nextPosition);
    }
    @Override
    boolean isValidPosition(int cellPosition) {
        return false;
    }

    public int getNextPosition() {
//        int next = nextPosition;
        nextPosition = 0;
        return nextPosition;
    }
}
