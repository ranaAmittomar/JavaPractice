package dsa; //implementing stack.

import java.util.Stack;

public class StackQues {
    public static void main(String[] args) {

        int[] arr = {0, 0, 1, 1, 2, 2, 2, 3, 4, 5, 5}; //removing duplicates. 
        Stack<Integer> stack = new Stack<>();
        for (int j : arr) {
            if (stack.empty()) {
                stack.push(j);
            }
            if (j != stack.peek()) {
                stack.push(j);
            }
        }
        for (int i : stack) {
            System.out.println(i);
        }
    }
}
