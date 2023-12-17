package dsa;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueQues {

    static Scanner sc = new Scanner(System.in);

    public static void quesFunctions() {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(3);
        queue.add(6);
        queue.add(4);
        queue.add(2);
        System.out.println("Ques from poll: " + queue);
        System.out.println("Removing the elemment after firt ieteration : " + queue.peek());
        queue.poll();
        System.out.println("Queue after poll and removing the : " + queue);
        System.out.println("The head of the queue is : " + queue.element());
        System.out.println("Removing :- " + queue.remove());
        System.out.println("The head of the queue is : " + queue.element());

    }

    public static void quesFuncUsingLoop() {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < 4; i++) {
            int num = sc.nextInt();
            q.add(num);
        }
        System.out.println("Queue after loop insertion is : " + q);
        System.out.println("Queue offer : " + q.offer(6));
        System.out.println("Queue after loop insertion is : " + q);

        sc.close();
    }

    // Please refer BST implementation class and see how to implement BST using
    // Queue Java Collecton.

    public static void main(String[] args) {
        // quesFunctions();
        quesFuncUsingLoop();
    }

}
