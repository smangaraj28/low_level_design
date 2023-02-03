package lld.snakeladder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // problem statement :
        // basic board ( 10 rows, 10 cols ) => 100 boxes
        // throw a dice ( 1 to 6 ) => based on the result moves from the initial  position
        // both players doing these steps
        // add a snake on the board
        // snake ( start pos , end pos ) ( start pos > end pos )

        List<Player> playerList = new ArrayList<>();
        Player p1 = new Player(0, "P1");
        Player p2 = new Player(0, "P2");
        playerList.add(p1);
        playerList.add(p2);
        List<Cell> cells = new ArrayList<>();
        for(int i = 1; i <= 100; i++) {
            cells.add(new Cell(i, new DefaultMove()));
        }
        Board board = new Board(cells);
        Dice dice = new Dice();
        Game game = new Game(playerList, board, dice);

        game.play(p1);
        game.play(game.getNextPlayerToPlay());


    }
}
