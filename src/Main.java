import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DisplayTime displayTime = new DisplayTime();
        System.out.println(displayTime.to24Time());
        displayTime.setTime(13, 32, 13);
        System.out.println(displayTime.to24Time());
        System.out.println(displayTime.to12HourTime());
        Arrays arrays = new Arrays();
        arrays.basicSyntax(); //CALLING basicSyntax() method from Arrays.java class.
        arrays.initializerArray();//calling initializerArray() .
        arrays.loopPrintArr();
        arrays.tablePrint();
        arrays.arraySum();
        arrays.randomNum();
        arrays.changeArrElem();
        arrays.multiArrayMatrix();
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
