package lld.tictactoe;

public class PlayerHistory {
    private int noOfGamesPlayed;
    private int noOfGamesWon;
    private int ranking;

    public int getNoOfGamesPlayed() {
        return noOfGamesPlayed;
    }

    public void setNoOfGamesPlayed(int noOfGamesPlayed) {
        this.noOfGamesPlayed = noOfGamesPlayed;
    }

    public int getNoOfGamesWon() {
        return noOfGamesWon;
    }

    public void setNoOfGamesWon(int noOfGamesWon) {
        this.noOfGamesWon = noOfGamesWon;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
}
