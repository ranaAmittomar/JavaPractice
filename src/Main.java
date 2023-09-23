import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      /*  DisplayTime displayTime = new DisplayTime();
        System.out.println(displayTime.to24Time());
        displayTime.setTime(13, 32, 13);
        System.out.println(displayTime.to24Time());
        System.out.println(displayTime.to12HourTime());*/
      /*  GUIapp.graphics();
        AdvanceGUI advanceGUI = new AdvanceGUI();
        advanceGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        advanceGUI.setSize(275, 180);
        advanceGUI.setVisible(true);*/
      /*  MultipleConstructor obj = new MultipleConstructor();
        MultipleConstructor obj1 = new MultipleConstructor(23);
        MultipleConstructor obj2 = new MultipleConstructor(23, 33);
        MultipleConstructor obj3 = new MultipleConstructor(23, 23, 23);
        System.out.println("First construct:- " + obj.to24HourTime());
        System.out.println("Second construct:- " + obj1.to24HourTime());
        System.out.println("Third construct:- " + obj2.to24HourTime());
        System.out.println("4th construct:- " + obj3.to24HourTime());*/

        BSTconstruct.gettingInput();
        ArraysQues arraysQues = new ArraysQues();
        arraysQues.basicSyntax(); //CALLING basicSyntax() method from ArraysQues.java class.
        arraysQues.initializerArray();//calling initializerArray() .
        arraysQues.loopPrintArr();
        arraysQues.tablePrint();
        arraysQues.arraySum();
        arraysQues.randomNum();
        arraysQues.changeArrElem();
        arraysQues.multiArrayMatrix();
        arraysQues.medianFind();
        //-------------------------------------------------------------//
        /*Recursion recursion = new Recursion();
        System.out.println("The numSum is :- " + recursion.numSum(5));*/
        ;
      /*  PracticingClassConstr practicingClassConstr2 = new PracticingClassConstr("Lovely"); //we passed String because in PracticingClassConstr we created a constructor which takes an argument
        PracticingClassConstr practicingClassConstr = new PracticingClassConstr("Amit"); //creating object for PracticingClassConstr class to use the methods inside it.
//        System.out.println("Enter any name:- ");
//        String tempName = input.nextLine(); //taking user input
//        practicingClassConstr.setGirlName(tempName); //setting it to setter in PracticingClassConstr method,
        practicingClassConstr.saying(); //printing out from a method inside PracticingClassConstr
        practicingClassConstr2.saying();*/
       /* Basics.takingInput(); //We've written this-> Basics.takingInput(); with the METHOD we defined in Basics Class & rest done by other methods.
        SearchAlgos searchAlgos = new SearchAlgos();
        SortingAlgo sortingAlgo = new SortingAlgo();

        LinklistQues linklistQues = new LinklistQues();
        StackQues stackQues = new StackQues();
        QueueQues queueQues = new QueueQues();
        GraphQues graphQues = new GraphQues();
        TreeQues treeQues = new TreeQues();*/
    }
}
