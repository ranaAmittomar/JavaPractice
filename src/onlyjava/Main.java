package onlyjava;

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

    public static boolean isEven(int n) {
        if (n == 0) {
            System.out.print("Number is zero: ");
            return false;
        }
        if (n % 2 == 0) {
            System.out.print("Number is even: ");
            return true;
        } else {
            System.out.print("Number is odd: ");
            return false;
        }

    }

    public static void multiPleOfNum(int tillSer, int ofMult, int fromNum) { // multiple of a number from-till
        for (int i = fromNum; i <= tillSer; i++) {
            if (i % ofMult == 0) {
                System.out.println(i);
            }
        }

    }

    public static void sumOfADigit() {
        // with debugging print statements.
        int num = 12312;
        int add = 0;
        int count = 0;
        while (num > 0) {
            System.out.println("now add is : " + add);
            count++;
            System.out.println("Now count is : " + count);
            int n = num % 10;
            System.out.println("Value of n: " + n);
            add += n;
            System.out.println("End of while add is : " + add);
            num = num / 10;

        }
        System.out.println("Final output of add is : " + add);
        System.out.println("Number of digits: " + count);
    }

    public static void printSum() {
        // sum greater than certain value and also odds.
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0 && i > 50) {
                sum += i;
            }
        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        // swapNumbers(5, 6);
        // System.out.println();
        // System.out.println(isEven(11));
        // multiPleOfNum(50, 5, 10);
        // sumOfADigit();
        printSum();
    }
}
