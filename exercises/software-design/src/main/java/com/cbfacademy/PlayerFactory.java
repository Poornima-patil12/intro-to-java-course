package com.cbfacademy;

public class PlayerFactory {
    /**
     * Creates a new player.
     *
     * @return A new player.
     */
    public static Player create() {
        return new DicePlayer();
    }
}
