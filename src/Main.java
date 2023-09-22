import java.util.Scanner;


public class Main {

    //Basic operations-Calling methods,inside methods
    //taking input will do all the work,we'll just call it in main function..
    public static void takingInput() {
        Scanner takeIn = new Scanner(System.in);
        System.out.println("Enter Two Numbers.");
        System.out.print("Enter first number:- ");
        int num1 = takeIn.nextInt();
        System.out.print("Enter second number:- ");
        int num2 = takeIn.nextInt();
        int addition = addNum(num1, num2);
        System.out.println("The Addition is :- " + addition);
        int multi = multiNum(num1, num2);
        System.out.println("The Multiplication:- " + multi);
        double takingFun = takingMultiMethod(num1, num2);
        System.out.println("From a multi-function call:- " + takingFun);
        if (zeroCheck(num1, num2)) {
            System.out.println("Cannot divide anything by 0");
            return;
        } else {
            double div = divNum(num1, num2);
            System.out.println("The Division:- " + div);
        }
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

    public static int divNum(int num1, int num2) {
        int div;

        if (num1 > num1) {
            return div = num1 / num2;
        } else {
            return div = num2 / num1;
        }
    }

    public static double takingMultiMethod(int n1, int n2) {
        double divi = addNum(n1, n2); //taking input from addNum() method.
        double result = divi / 3; //doing simple calculation.
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        takingInput();
        SearchAlgos searchAlgos = new SearchAlgos();
        SortingAlgo sortingAlgo = new SortingAlgo();
        Arrays arrays = new Arrays();
        LinklistQues linklistQues = new LinklistQues();
        StackQues stackQues = new StackQues();
        QueueQues queueQues = new QueueQues();
        GraphQues graphQues = new GraphQues();
        TreeQues treeQues = new TreeQues();
    }
}
