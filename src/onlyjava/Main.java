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
        // tryCatchFunc();
        /*
         * onlyjava.DisplayTime displayTime = new onlyjava.DisplayTime();
         * System.out.println(displayTime.to24Time());
         * displayTime.setTime(13, 32, 13);
         * System.out.println(displayTime.to24Time());
         * System.out.println(displayTime.to12HourTime());
         */
        /*
         * onlyjava.GUIapp.graphics();
         * AdvanceGUI advanceGUI = new AdvanceGUI();
         * advanceGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         * advanceGUI.setSize(275, 180);
         * advanceGUI.setVisible(true);
         */
        /*
         * onlyjava.MultipleConstructor obj = new onlyjava.MultipleConstructor();
         * onlyjava.MultipleConstructor obj1 = new onlyjava.MultipleConstructor(23);
         * onlyjava.MultipleConstructor obj2 = new onlyjava.MultipleConstructor(23, 33);
         * onlyjava.MultipleConstructor obj3 = new onlyjava.MultipleConstructor(23, 23, 23);
         * System.out.println("First construct:- " + obj.to24HourTime());
         * System.out.println("Second construct:- " + obj1.to24HourTime());
         * System.out.println("Third construct:- " + obj2.to24HourTime());
         * System.out.println("4th construct:- " + obj3.to24HourTime());
         */

        // dsa.BSTconstruct.gettingInput();
        // -----------------------------------------------//
        ArraysQues arraysQues = new ArraysQues();
        arraysQues.basicSyntax(); // CALLING basicSyntax() method from dsa.ArraysQues.java class.
        arraysQues.initializerArray();// calling initializerArray() .
        arraysQues.loopPrintArr();
        arraysQues.tablePrint();
        arraysQues.arraySum();
        arraysQues.randomNum();
        arraysQues.changeArrElem();
        arraysQues.multiArrayMatrix();
        arraysQues.medianFind();
        arraysQues.usingArrayList();
        arraysQues.arrayMethods();
        arraysQues.uniqueNum();
        System.out.print("Sort it up: " + Arrays.toString(arraysQues.sortItUp()));
        arraysQues.mergeSortedArray();

        swapNumbers(5, 6);

        // -------------------------------------------------------------//
        /*
         * for (onlyjava.EnumExamples people : onlyjava.EnumExamples.values()) {
         * System.out.printf("%s\t%s\t%d\n", people, people.getDesc(),
         * people.getYear());
         * }
         * System.out.println("\nThe Range usage:- ");
         * for (onlyjava.EnumExamples people : EnumSet.range(onlyjava.EnumExamples.Love,
         * onlyjava.EnumExamples.Anuj)) {
         * System.out.printf("%s\t%s\t%d\n", people, people.getDesc(),
         * people.getYear());
         * }
         */
        /*
         * dsa.Recursion recursion = new dsa.Recursion();
         * System.out.println("The numSum is :- " + recursion.numSum(5));
         */
        ;
        /*
         * onlyjava.PracticingClassConstr practicingClassConstr2 = new
         * onlyjava.PracticingClassConstr("Lovely"); //we passed String because in
         * onlyjava.PracticingClassConstr we created a constructor which takes an argument
         * onlyjava.PracticingClassConstr practicingClassConstr = new
         * onlyjava.PracticingClassConstr("Amit"); //creating object for onlyjava.PracticingClassConstr
         * class to use the methods inside it.
         * // System.out.println("Enter any name:- ");
         * // String tempName = input.nextLine(); //taking user input
         * // practicingClassConstr.setGirlName(tempName); //setting it to setter in
         * onlyjava.PracticingClassConstr method,
         * practicingClassConstr.saying(); //printing out from a method inside
         * onlyjava.PracticingClassConstr
         * practicingClassConstr2.saying();
         */
        /*
         * onlyjava.Basics.takingInput(); //We've written this-> onlyjava.Basics.takingInput(); with the
         * METHOD we defined in onlyjava.Basics Class & rest done by other methods.
         * dsa.SearchAlgos searchAlgos = new dsa.SearchAlgos();
         * dsa.SortingAlgo sortingAlgo = new dsa.SortingAlgo();
         * 
         * dsa.LinklistQues linklistQues = new dsa.LinklistQues();
         * dsa.StackQues stackQues = new dsa.StackQues();
         * dsa.QueueQues queueQues = new dsa.QueueQues();
         * dsa.GraphQues graphQues = new dsa.GraphQues();
         * dsa.TreeQues treeQues = new dsa.TreeQues();
         */
    }
}
