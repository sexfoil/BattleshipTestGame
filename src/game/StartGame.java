package game;

import game.entity.GameBoard;
import game.utils.InputHelper;

public class StartGame {

    static GameBoard board;
    public static void main(String[] args) {
        board = new GameBoard();
        board.display();

        System.out.println("*************************");

        InputHelper inputHelper = new InputHelper();
        while (true) {
            try {

                int[] coordinates = inputHelper.getUserInput();
                shoot(coordinates);
            } catch (RuntimeException ex) {
                System.out.println(ex.getMessage());
                break;

            }
        }

    }

    static void shoot(int[] coordinates) {
        board.shootAt(coordinates[0], coordinates[1]);
        board.display();
    }
}
