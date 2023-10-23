package onlyjava;

import dsa.ArraysQues;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void swapNumbers(int a, int b) { // swapNumbers without third var.;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.print("\nSwapped numbers: a= " + a + " b= " + b);
    }

    public static void tryCatchFunc() {
        Scanner in = new Scanner(System.in);
        int x = 1;
        do {
            try {
                System.out.print("Enter First Num:- ");
                int n1 = in.nextInt();
                System.out.print("Enter Second Num:- ");
                int n2 = in.nextInt();
                System.out.println("Dividing......");
                int div = n1 / n2;
                System.out.println("Division:- " + div);
                x = 2; // to break the do function and never go to execute while again and again.

            } catch (Exception e) {
                System.out.println("You can't divide by Zero....");
            }
        } while (x == 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        swapNumbers(5, 6);
    }
}
