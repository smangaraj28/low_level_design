package lld.snakeladder;

public class Player {
    // position
    // playerName

    private int position;
    private String playerName;

    public Player(int position, String playerName) {
        this.position = position;
        this.playerName = playerName;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
