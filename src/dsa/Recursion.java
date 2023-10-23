package dsa;

import java.util.ArrayList;

public class Recursion {

    public static int fib(int n) {

        int[] memo = new int[1000];
        if (n <= 1) {
            return n;
        }
        if (memo[n] != 0) {
            return memo[n];
        } else {
            memo[n] = fib(n - 1) + fib(n - 2);
            return memo[n];
        }
    }

    public static int printingSum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + printingSum(n - 1);
        }
    }

    public static void printNums(int n) {
        if (n > 0) {
            printNums(n - 1);
            System.out.println(n + " ");
        }
    }

    public static void printNumsRev(int n) {
        if (n > 0) {
            System.out.println(n + " ");
            printNumsRev(n - 1);
        }
    }

    private static void printAlphaNums(String[] str, int n) { // printing alphabet for the numbers.

        if (n == 0) {
            return;
        }
        printAlphaNums(str, n / 10);
        System.out.print(str[n % 10] + " ");
    }

    public static int powOf2(int timesPow, int num) {
        if (timesPow == 0) {
            return 1;
        }
        int ans = num * powOf2(timesPow - 1, num);
        System.out.println("for " + timesPow + " answer is " + ans);
        return ans;
    }

    public static int fastExpo(int time, int num) { // fast exponential
        if (time == 0) {
            return 1;
        }
        int ans = fastExpo(time / 2, num);
        ans *= ans; // Square the answer
        if (time % 2 == 1) {
            ans *= num; // If time is odd, multiply by num
        }
        return ans;
    }

    public static boolean sortedArrCheck(int[] arr, int index) {
        if (index >= arr.length) {
            return true;
        }
        if (arr[index] < arr[index - 1]) {
            return false;
        }
        return sortedArrCheck(arr, index + 1);
    }

    public static void subsetsArray(ArrayList<Integer> input, ArrayList<Integer> output, int index) {

        if (index >= input.size()) {
            for (int i : output) {
                System.out.print(i);
            }
            System.out.println();
            return;
        }

        subsetsArray(input, output, index + 1); // taking element.
        output.add(input.get(index));
        subsetsArray(input, output, index + 1);
        output.remove(output.size() - 1); // remove the added element for the next branch
    }

    public static void subsetString(String input, String output, int strIndex) {

        if (strIndex == input.length()) {
            System.out.println(output);
            return;
        }
        // include character.
        subsetString(input, output + input.charAt(strIndex), strIndex + 1);

        // Exclude the current character
        subsetString(input, output, strIndex + 1);
    }

    public static int jumpStairs(int n) { // number of jumps to reach to a certain number.
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        return jumpStairs(n - 1) + jumpStairs(n - 2) + jumpStairs(n - 3);
    }

    public static char[] swapChars(char[] ch, int i, int j) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return ch;
    }

    public static void permutationStr(String str, int index) {

        if (index >= str.length()) {
            System.out.println(str);
            return;
        }
        char[] ch = str.toCharArray(); // Convert the string to a character array
        for (int i = index; i < str.length(); i++) {
            ch = swapChars(ch, index, i); // Swap characters in the character array
            permutationStr(new String(ch), index + 1); // Recurse with the modified string
            ch = swapChars(ch, index, i); // Restore the original character array
        }

    }

    public static void main(String[] args) {

        // String str[] = { "zero", "one", "two", "three", "four", "five", "six",
        // "seven", "eight", "nine" };
        // int timesPower = 3;
        // int numForPower = 7;
        // int[] arr = { 1, 2, 3 }; // array for sort check.
        // // System.out.println(fib(10));
        // // System.out.println(printingSum(n));
        // // printNums(n);
        // // printNumsRev(n);
        // // printAlphaNums(str, n);
        // System.out.println("Power of " + numForPower + " times " + timesPower);
        // powOf2(timesPower, numForPower);
        // System.out.println(fastExpo(timesPower, numForPower));
        // System.out.println(sortedArrCheck(arr, 1));
        // ArrayList<Integer> arr1 = new ArrayList<>();
        // arr1.add(1);
        // arr1.add(2);
        // arr1.add(3);
        // ArrayList<Integer> output = new ArrayList<>();
        // subsetsArray(arr1, output, 0);
        // int num = 5;
        // System.out.println("Number of jumps to reach " + num + " are " +
        // jumpStairs(num));
        String s = "abc";
        String outputString = "";
        subsetString(s, outputString, 0);
        permutationStr(s, 0);

    }

}
