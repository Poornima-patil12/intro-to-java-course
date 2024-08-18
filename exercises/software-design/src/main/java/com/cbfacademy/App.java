package com.cbfacademy;

public class App {
    public static void main(String[] args) {
        Game game = GameFactory.create();
        String winner = game.play();
        Player player1 = PlayerFactory.create();
        Player player2 = PlayerFactory.create();
        Game dice = new DiceGame(player1, player2);
        // winner=player1.();
        dice.play();

        if (winner == null) {
            System.out.println("It's a draw!");
        } else {
            System.out.println(winner + " wins!");
        }
    }

}
