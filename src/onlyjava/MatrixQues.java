package onlyjava;

import java.util.Scanner;

public class MatrixQues {

    public static void columnSum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows:- ");
        int row = sc.nextInt();
        System.out.print("Enter column: ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                sum += arr[j][i];
            }
            System.out.print(sum + " ");

        }
    }

    public static void main(String[] args) {
        columnSum();
    }
}
