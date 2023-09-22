import java.util.Scanner;

public class Basics {
    //Basic operations-Calling methods,inside methods
    //taking input will do all the work,we'll just call it in main function..
    public static void takingInput() {
        Scanner takeIn = new Scanner(System.in);
        System.out.println("Enter Two Numbers.");
        System.out.print("Enter first number:- ");
        int num1 = takeIn.nextInt();
        System.out.print("Enter second number:- ");
        int num2 = takeIn.nextInt();
        long start = System.currentTimeMillis();
        int addition = addNum(num1, num2);
        System.out.println("The Addition is :- " + addition);
        int multi = multiNum(num1, num2);
        System.out.println("The Multiplication:- " + multi);
        double takingFun = takingMultiMethod(num1, num2);
        System.out.println("From a multi-function call:- " + takingFun);
        System.out.println("The average of numbers is(statically typed by me) :- " + average(2, 5, 6));//calling average method.
        if (zeroCheck(num1, num2)) {
            System.out.println("Cannot divide anything by 0");
            return;
        } else {
            double div = (double) divNum(num1, num2);
            System.out.println("The Division:- " + div);
        }
        long end = System.currentTimeMillis();
        System.out.println("Starting time of calculations:- " + start);
        System.out.println("Ending time of calculations:- " + end);
        System.out.println("Time Difference is :- " + (end - start));
        System.out.println("Time took: " + (end - start) / 1000. + " sec."); //to check how much time our program is taking to run.
    }

    public static void timeCheck() {

    }

    public static boolean zeroCheck(int n1, int n2) { //checking for if division possible..
        if (n1 == 0 || n2 == 0) {
            return true;
        } else return false;
    }

    public static int addNum(int num1, int num2) {
        int add = num1 + num2;
        return add;
    }

    public static int multiNum(int num1, int num2) {
        int multi = num1 * num2;
        return multi;
    }

    public static double divNum(int num1, int num2) {
        double div;

        if (num1 > num2) {
            return div = (double) num1 / num2;
        } else {
            return div = (double) num2 / num1;
        }
    }

    /*
     public static void testingLoopTime() {
        int res = 0;
        long start;
        long end;
        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            for (int j = 0; j < 100000; j++) {
                res++;
            }
        }
        System.out.println(res);
        end = System.currentTimeMillis();
        System.out.println("Time Difference is :- " + (end - start));
        System.out.println("Time took: " + (end - start) / 1000. + " sec.");
    }
    * */


    public static double takingMultiMethod(int n1, int n2) {
        double divi = addNum(n1, n2); //taking input from addNum() method.
        double result = divi / 3; //doing simple calculation.
        return result;
    }

    public static int average(int... number) { //these dots(...) shows that,I don't know how many numbers we may throw in this.
        int total = 0;
        for (int x : number) {
            total += x;
        }
        return total / number.length;
    }

}
