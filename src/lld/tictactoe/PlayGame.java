package lld.tictactoe;

public class PlayGame {
    public static void main(String[] args) {
        Player p1 = new Player();
        p1.setPlayerId("1");
        p1.setPlayerName("Einstein");
        p1.setPlayerSymbol('X');

        Player p2 = new Player();
        p2.setPlayerId("2");
        p2.setPlayerName("Plank");
        p2.setPlayerSymbol('O');

        Player[] players = new Player[]{p1, p2};
        GameBoard gameBoard = new GameBoard(3, players);
        gameBoard.startGame();

    }
}
