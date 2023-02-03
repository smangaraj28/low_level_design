package lld.snakeladder;

import java.util.*;

public class Game {

    // Board
    // Dice
    // playerQueue
    // play(Player player) { }

    private Board board;
    private Dice dice;
    private Queue<Player> playerQueue;
    private Map<Player, Integer> res;
    private int winnerCount;

    public void setDice(Dice dice) {
        this.dice = dice;
    }

    public void setPlayerQueue(Queue<Player> playerQueue) {
        this.playerQueue = playerQueue;
    }

    public void setRes(Map<Player, Integer> res) {
        this.res = res;
    }

    public Game(List<Player> playerList, Board board, Dice dice) {
        this.board = board;
        this.dice = dice;
        this.res = new HashMap<>();
        this.playerQueue = new ArrayDeque<>(playerList);
    }

    public void play(Player player) {
        if(player == null) {
            System.out.println("End Game");
        }
        int diceNumber = this.dice.rollDice();
        int playerCurrentPos = player.getPosition();
        int playerNextPos = this.board.moveToNextPosition(playerCurrentPos, diceNumber);
        player.setPosition(playerNextPos);
        refreshGame(player);
    }

    private void refreshGame(Player player) {
        if(checkReachToEnd(player)) {
            res.put(player, ++winnerCount);
            if(playerQueue.size() == 1) {
                res.put(playerQueue.poll(), ++winnerCount);
            }
        } else {
            playerQueue.add(player);
        }
    }

    private boolean checkReachToEnd(Player player) {
        return player.getPosition() == 100;
    }


    public Player getNextPlayerToPlay() {
        if(playerQueue.size() <= 1) {
            System.out.println("Game is Over");
            return null;
        } else {
            return playerQueue.poll();
        }
    }
}


