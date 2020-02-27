package com.packtp.tddjava.ch03ttt;

/**
 * @author Johnson
 * @date 2020/2/26 22:05
 */
public class TicTacToe {
    private Character[][] board = {{'\0', '\0', '\0'}, {'\0', '\0', '\0'}, {'\0', '\0', '\0'}};

    private char lastPlayer = '\0';

    public String play(int x, int y) {
        checkAxis(x);
        checkAxis(y);

        setBox(x, y);

        lastPlayer = nextPlayer();
        for (int i = 0; i < 3; i++) {
            if(board[0][i] == 'X' && board[1][i] == 'X' && board[2][i] == 'X'){
                return lastPlayer + " is winner";
            }

        }

        return "no winner";
    }

    private void setBox(int x, int y) {
        if (board[x - 1][y - 1] != '\0') {
            throw new RuntimeException(" box is occupied");
        } else {
            board[x - 1][y - 1] = 'X';
        }
    }

    private void checkAxis(int axis) {
        if (axis > 3 || axis < 1) {
            throw new RuntimeException("X is outside board");
        }
    }

    public char nextPlayer() {
        if (lastPlayer == 'X') {
            return 'O';
        }
        return 'X';
    }
}