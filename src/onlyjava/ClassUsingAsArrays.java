
package onlyjava;

import java.util.LinkedList;
import java.util.Queue;

class Example {
    String n1;
    String n2;

    public Example(String n1, String n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

}

public class ClassUsingAsArrays {

    public static void main(String[] args) {
        // Example[] names = new Example[2]; // Using array.
        // names[0] = new Example("Amit", "Tomar");
        // names[1] = new Example("Shweta", "Meena");
        // for (Example s : names) {
        // System.out.println(s.n1);
        // }

        Queue<Example> queExamples = new LinkedList<>();

        Example e1 = new Example("Amit", "Tomar");
        Example e2 = new Example("Shweta", "Meena");
        queExamples.add(e1);
        queExamples.add(e2);
        while (!queExamples.isEmpty()) {
            System.out.println("Loop Enter");
            Example example = queExamples.poll();
            System.out.println(example.n1 + " ");
            System.out.println("Loop Exit");
        }

    }
}
