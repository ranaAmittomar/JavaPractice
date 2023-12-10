package onlyjava;

import java.util.Scanner;

/**
 * The `MatrixQues` class contains methods for performing various operations on
 * matrices, such as finding the sum of each column,
 * determining the size of the matrix, and setting zeros in the matrix.
 *
 * Example Usage:
 * MatrixQues.columnSum();
 * MatrixQues.setZeroInMatrix();
 * MatrixQues.sizeOfColAndRow();
 *
 * Code Analysis:
 * The main functionalities of the `MatrixQues` class are:
 * - Finding the sum of each column in a matrix.
 * - Determining the size (number of rows and columns) of a matrix.
 * - Setting zeros in a matrix based on certain conditions.
 *
 * Methods:
 * - columnSum(): This method prompts the user to enter the number of rows and
 * columns for a matrix, and then takes input for each element of the matrix.
 * It calculates the sum of each column and prints the result.
 *
 * - sizeOfColAndRow(): This method initializes a 2D array with predefined
 * values and calculates the number of rows and columns in the matrix.
 * It then prints the result.
 *
 * - setZeroInMatrix(): This method initializes a 2D array with predefined
 * values and checks if the first row or column contains any zeros.
 * It then marks zeros in the first row and column based on the presence of
 * zeros in the rest of the matrix.
 * Finally, it sets zeros in the matrix based on the marks and prints the
 * resulting matrix.
 *
 * Fields:
 * The `MatrixQues` class does not have any fields.
 */
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

    public static void sizeOfColAndRow() {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 2, 3, 4, 5 },
                { 1, 1, 1, 1 },
                { 23, 3, 3, 3 },
                { 1, 1, 1, 1 }
        };
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        System.out.println("Row len : " + rowLen);
        System.out.println("Col len: " + colLen);
    }

    public static void matrixTranspose() {
        int[][] matrix = {
                { 0, 1, 2, 0 },
                { 3, 4, 0, 2 },
                { 1, 3, 1, 5 },
                { 8, 7, 6, 9 } };
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] ans = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ans[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void setZeroInMatrix() {
        int[][] matrix = {
                { 0, 1, 2, 0 },
                { 3, 4, 0, 2 },
                { 1, 3, 1, 5 },
                { 8, 7, 6, 9 } };

        boolean firstRow = false;
        boolean firstCol = false;

        // Check if the first row contains zero
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                firstRow = true;
                break;
            }
        }

        // Check if the first column contains zero
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                firstCol = true;
                break;
            }
        }

        // Mark zeros in the first row and column
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Set zeros based on marks in the first row and column
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Set zeros in the first row
        if (firstRow) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }

        // Set zeros in the first column
        if (firstCol) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }

        System.out.println("The matrix is: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // columnSum();
        // setZeroInMatrix();
        // sizeOfColAndRow();
        matrixTranspose();
    }
}
