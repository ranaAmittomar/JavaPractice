import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Basics.takingInput(); //We only called this CLASS with the OBJECT in main & rest done by other methods.
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
