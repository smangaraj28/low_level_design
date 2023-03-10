package lld.tictactoe;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GameBoard {
    // Game
    char[][] board;
    int boardSize; // 3
    Queue<Player> nextTurn; // [A, B, C]
    Scanner input;
    // offer ( enqueue ) , poll ( dequeue )
    // player Info ( A , B, C ) -> A -> B -> C -> A -> B -> C-> A
    //  B -> C -> A

    // boardSize = 3
    // outer for loop -> no of lines ( rows ) -> 5
    // no of columns -> 5

    // boardSize = 4
    // no of rows -> 7
    // no of cols -> 7

    // boardSize = 5
    // no of rows -> 9
    // no of cols -> 9

    // player 0 => player 1

    public GameBoard(int boardSize, Player[] players) {
        this.boardSize = boardSize;
        this.board = new char[2 * boardSize - 1][2 * boardSize - 1];
        initialise(this.board);
        nextTurn = new LinkedList<>();
        Arrays.stream(players).forEach(player -> nextTurn.offer(player));
//        nextTurn.offer(players[0]);
//        nextTurn.offer(players[1]);
        input = new Scanner(System.in);
    }

    private void initialise(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (i % 2 == 0 && j % 2 != 0) board[i][j] = '|';
                if (i % 2 != 0 && j % 2 == 0) board[i][j] = '-';
                if (i % 2 != 0 && j % 2 != 0) board[i][j] = '+';
            }
        }
    }

    private void printBoard() {
        for (char[] row : this.board) {
            for (char col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public void startGame() {
        int noOfMoves = 0;
        printBoard();
        while (true) {
            noOfMoves += 1;
            if (noOfMoves == (boardSize * boardSize) + 1) {
                System.out.println("Match Draw");
                break;
            } // P3 P2 P1
            Player p = nextTurn.poll(); // P1
            int position = getUserInput(p);           // ( row, col )
            int row = getRow(position);
            int col = getCol(position);
            board[row][col] = p.getPlayerSymbol();
            System.out.println("Board After the Move");
            printBoard();
            // success
            if (noOfMoves >= boardSize && checkEndGame(p, row, col)) break;
            nextTurn.offer(p);
        }
    }

    public int getRow(int position) {
        return 2 * ((position % boardSize == 0) ? (position / boardSize) - 1 : position / boardSize);
    }

    public int getCol(int position) {
        return 2 * ((position % boardSize == 0 ? boardSize : position % boardSize) - 1);
    }

    private boolean checkEndGame(Player p, int row, int col) {
        String winString = ""; // 000 or XXX
        for (int i = 0; i < boardSize; i++) {
            winString += String.valueOf(p.getPlayerSymbol());
        }
        String rowString = "";
        String colString = "";
        String diagonalString = "";
        String reverseDiagonalString = "";
        for (int i = 0; i < board.length; i = i + 2) {
            rowString += board[row][i];
            colString += board[i][col];
            if (row == col) {
                diagonalString += board[i][i];
            }
            if (row + col == board.length - 1) {
                reverseDiagonalString += board[board.length - i - 1][i];
            }
        }
        if (winString.equals(rowString) || winString.equals(colString) || winString.equals(diagonalString)
                || winString.equals(reverseDiagonalString)) {
            System.out.println(p.getPlayerName() + " won the game");
            return true;
        }
        return false;
    }

    private int getUserInput(Player p) {
//        printBoard();
        System.out.println(p.getPlayerName() +
                " Please Enter a number between 1 - " + (boardSize * boardSize));
        int val = input.nextInt();
        while (!validateInput(val)) {
//            printBoard();
            System.out.println("Wrong Position - " + p.getPlayerName() +
                    " Please Enter a number between 1 - " + (boardSize * boardSize));
            val = input.nextInt();
        }
        return val;
    }

    // val is in between  ( 1 to board*board )
    // val -> 6 ,
    // boardSize -> 3
    // row = 2 * floor ( val / boardSize )
    // col = 2 * ( ( val % boardSize == 0 ? boardSize : val % boardSize ) - 1 )
    // board[row][col] == null ( place return true )
    private boolean validateInput(int val) { // val = 1 , row = 0, col = 0; val =2 , row = 0, col = 2
        if (val < 1 || val > (boardSize * boardSize)) return false;
        int row = getRow(val);
        int col = getCol(val);
        if ((int) board[row][col] != 0) return false;
        return true;
    }


    /*
    X|0|
    -+-+-
     | |
    -+-+-
     | |
     */

//    noOfMoves = 2
//    boardSize = 3


//    input : 1 to 9 , input : 10


}
