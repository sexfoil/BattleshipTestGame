package game;

import game.entity.GameBoard;

public class StartGame {

    static GameBoard board;
    public static void main(String[] args) {
        board = new GameBoard();
        board.display();

        System.out.println("*************************");

        shoot(0,0);
        shoot(1,1);
        shoot(2,3);
        shoot(4,2);
        shoot(0,4);
    }

    static void shoot(int x, int y) {
        board.shootAt(x, y);
        board.display();
    }
}
