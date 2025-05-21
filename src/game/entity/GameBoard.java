package game.entity;

import java.util.Arrays;

public class GameBoard {

    private Cell[][] board = new Cell[5][5];

    public GameBoard() {
        this.board = board;
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board.length; y++) {
                board[x][y] = new Water();
            }
        }

        board[1][1] = new Ship(3);
        board[2][3] = new Ship(1);
        board[4][2] = new Ship(2);
    }

    public void shootAt(int x, int y) {
        board[x][y].onShot();
    }

    public  void display() {
        for (Cell[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }

}
