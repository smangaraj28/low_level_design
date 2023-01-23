package lld.tictactoe;


/*

TicTacToe

-> Board should N * N
-> Player profile required
-> Extensible for statistic Collections
-> Ranking of players can be done on basis of winning percentage

P1 > P2 > P3



P1 -> wins P2
P1 -> wins P2
P2 -> wins P1

P1 -> 66.66%
P2 -> 33.33%

P1, P2 -> (p1 70%, p2 30%)

 */
// import lombok.
public class Player {
    private String playerId;
    private String playerName;
    private String address;
    private PlayerHistory playerHistory;
    private char playerSymbol; // * , 0

    // Getters , Setters , Constructors


    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public PlayerHistory getPlayerHistory() {
        return playerHistory;
    }

    public void setPlayerHistory(PlayerHistory playerHistory) {
        this.playerHistory = playerHistory;
    }

    public char getPlayerSymbol() {
        return playerSymbol;
    }

    public void setPlayerSymbol(char playerSymbol) {
        this.playerSymbol = playerSymbol;
    }
}