package lld.snakeladder;

public class DefaultMove extends Move {

    public DefaultMove() {
        super(0);
    }

    @Override
    boolean isValidPosition(int cellPosition) {
        return false;
    }
}
