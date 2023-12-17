package leetcode_questions;

import java.util.Arrays;

public class QueenProb {

    static final int N = 8;

    static boolean isSafe(int[][] board, int row, int col) { // checking function if it is safe to place queen .

        for (int i = 0; i < col; i++) { // check if queen in same row to left.
            if (board[row][i] == 1) {
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) { // check if queen in upper left diagonal
            if (board[i][j] == 1) {
                return false;
            }
        }
        for (int i = row, j = col; i < N && j >= 0; i++, j--) { // lower left diagonal
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    static boolean solveQueen(int[][] board, int col) {

        if (col == N) { // print board if queens are placed.
            for (int[] row : board) {
                System.out.println(Arrays.toString(row));
            }
            System.out.println();
            return true;
        }

        // trying to place queen each row of col. USING BACKTRACK

        for (int i = 0; i < N; i++) {
            if (isSafe(board, i, col)) { // if safe to place.
                board[i][col] = 1; // placing the queen.
                if (solveQueen(board, col + 1)) {
                    return true;
                }
                board[i][col] = 0;

            }
        }
        return false; // if no solution is found, return false
    }

    public static void main(String[] args) {
        int[][] board = new int[N][N];
        if (!solveQueen(board, 0)) {
            System.out.println("No Solution Found");
        }
    }

}
