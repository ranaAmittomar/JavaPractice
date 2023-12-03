package dsa;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * The `Recursion` class contains various recursive methods that demonstrate
 * different concepts and techniques related to recursion.
 * These methods include calculating the Fibonacci sequence, printing the sum of
 * numbers, printing numbers in ascending and descending order,
 * printing alphabets for numbers, calculating the power of a number, checking
 * if an array is sorted, generating subsets of an array,
 * generating subsets of a string, solving the Tower of Hanoi problem,
 * generating permutations of a string, counting the number of jumps to reach a
 * certain number,
 * swapping characters in a string, checking if an array is sorted, and summing
 * the elements of an array.
 *
 * Example Usage:
 * // Calculate the Fibonacci sequence for n=10
 * int fibResult = Recursion.fib(10);
 * System.out.println(fibResult); // Output: 55
 *
 * // Print the sum of numbers from 1 to n=5
 * int sumResult = Recursion.printingSum(5);
 * System.out.println(sumResult); // Output: 15
 *
 * // Print numbers from 1 to n=5 in ascending order
 * Recursion.printNums(5); // Output: 1 2 3 4 5
 *
 * // Print numbers from 1 to n=5 in descending order
 * Recursion.printNumsRev(5); // Output: 5 4 3 2 1
 *
 * // Print alphabets for numbers from 1 to n=5
 * String[] str = {"zero", "one", "two", "three", "four", "five"};
 * Recursion.printAlphaNums(str, 5); // Output: five four three two one
 *
 * // Calculate the power of 2 for timesPow=3 and num=7
 * int powResult = Recursion.powOf2(3, 7);
 * System.out.println(powResult); // Output: 343
 *
 * // Calculate the fast exponential for time=3 and num=2
 * int expoResult = Recursion.fastExpo(3, 2);
 * System.out.println(expoResult); // Output: 8
 *
 * // Check if an array is sorted
 * int[] arr = {1, 2, 3, 4, 5};
 * boolean isSorted = Recursion.sortedArrCheck(arr, 1);
 * System.out.println(isSorted); // Output: true
 *
 * // Generate subsets of an array
 * ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
 * ArrayList<Integer> output = new ArrayList<>();
 * Recursion.subsetsArray(input, output, 0);
 * // Output:
 * // 123
 * // 12
 * // 13
 * // 1
 * // 23
 * // 2
 * // 3
 *
 * // Generate subsets of a string
 * String inputString = "abc";
 * String outputString = "";
 * Recursion.subsetString(inputString, outputString, 0);
 * // Output:
 * // abc
 * // ab
 * // ac
 * // a
 * // bc
 * // b
 * // c
 *
 * // Calculate the number of jumps to reach a certain number
 * int jumpResult = Recursion.jumpStairs(5);
 * System.out.println(jumpResult); // Output: 13
 *
 * // Swap characters in a string and generate permutations
 * String str = "abc";
 * Recursion.permutationStr(str, 0);
 * // Output:
 * // abc
 * // acb
 * // bac
 * // bca
 * // cab
 * // cba
 *
 * // Solve the Tower of Hanoi problem
 * Recursion.towerOfHanoi(3, 'A', 'B', 'C');
 * // Output:
 * // Move disk 1 from rod A to rod C
 * // Move disk 2 from rod A to rod B
 * // Move disk 1 from rod C to rod B
 * // Move disk 3 from rod A to rod C
 * // Move disk 1 from rod B to rod A
 * // Move disk 2 from rod B to rod C
 * // Move disk 1 from rod A to rod C
 *
 * // Test a weird recursive function
 * int weirdResult = Recursion.testingWeirdFunc(5);
 * System.out.println(weirdResult); // Output: 120
 *
 * // Check if an array is sorted and calculate the sum of its elements
 * int[] arr = {1, 2, 3};
 * int size = arr.length;
 * boolean isSorted = Recursion.isSortedArray(arr, size);
 * System.out.println(isSorted); // Output: true
 * int sumResult = Recursion.arraySum(arr, size);
 * System.out.println(sumResult); // Output: 6
 */
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

    public static char[] swapChars(char[] ch, int i, int j) { // swapping the characters function .
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

    public static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {

        if (n == 0) {
            return;
        }
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk " + n + " from rod "
                + from_rod + " to rod "
                + to_rod);
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    }

    public static int testingWeirdFunc(int n) {

        // recursion rel in the end :- TAIL RECURSION
        System.out.println(n);
        if (n == 1) {
            return 1;
        }
        System.out.println(n);
        return n * testingWeirdFunc(n - 1);

    }

    // checking if array is sorted..
    public static boolean isSortedArray(int[] arr, int size) {

        if (size == 0 || size == 1)
            return true;
        if (arr[0] > arr[1])
            return false;
        else {
            // creating the subarray to pass.
            int[] subArray = new int[size - 1];
            System.arraycopy(arr, 1, subArray, 0, size - 1);
            boolean rem = isSortedArray(subArray, size - 1);
            return rem;
        }
    }

    // summing the array.
    public static int arraySum(int[] arr, int size) {
        if (size == 0)
            return 0;
        if (size == 1)
            return arr[0];
        int[] subArray = new int[size - 1];
        System.arraycopy(arr, 1, subArray, 0, size - 1);
        int sum = arr[0] + arraySum(subArray, size - 1);
        return sum;
    }

    public static boolean linearSearch(int[] arr, int size, int key) {
        printArrayLinearSearch(arr, size);
        if (size == 0)
            return false;
        if (arr[0] == key)
            return true;
        else {
            int[] subArray = new int[size - 1]; // creating subarray..
            System.arraycopy(arr, 1, subArray, 0, size - 1);
            return linearSearch(subArray, size - 1, key);
        }

    }

    public static boolean linearSearchNew(int[] arr, int size, int key) {
        printArrayLinearSearch(arr, size);
        if (size == 0)
            return false;
        if (arr[0] == key)
            return true;
        else {
            int[] subArray = Arrays.copyOfRange(arr, 1, size);
            return linearSearchNew(subArray, size - 1, key);
        }
    }

    private static void printArrayLinearSearch(int[] arr, int size) {
        System.out.println("Size of array: " + size);
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static boolean binarySearchRec(int[] arr, int start, int end, int key) { // binary search using recursion.
        if (start > end)
            return false; // when element not found.
        int mid = start + (end - start) / 2;
        if (arr[mid] == key)
            return true; // when element found.
        if (arr[mid] < key) {
            return binarySearchRec(arr, mid + 1, end, key);
        } else {
            return binarySearchRec(arr, start, mid - 1, key);
        }

    }

    // REVERSING THE STRING USING RECURSION..
    public static void reverseString(char[] charArray, int start, int end) {

        // base case.
        if (start >= end) {
            String s = new String(charArray);
            System.out.println(s);
            return;
        }
        char temp = charArray[start];
        charArray[start] = charArray[end];
        charArray[end] = temp;

        // Recursive call to reverse the rest of the string
        reverseString(charArray, start + 1, end - 1);
    }

    public static boolean isPalindromeRecursion(String s, int start, int end) { // palindrome check using recursion.
        char[] str = s.toCharArray();
        if (start > end) {
            return true;
        }
        if (str[start] != str[end])
            return false;
        else {
            return isPalindromeRecursion(s, start + 1, end - 1);
        }
    }

    public static void main(String[] args) {

        // String str[] = { "zero", "one", "two", "three", "four", "five", "six",
        // "seven", "eight", "nine" };
        // // int timesPower = 3;
        // // int numForPower = 7;
        // // int[] arr = { 1, 2, 3 }; // array for sort check.
        // // // System.out.println(fib(10));
        // // // System.out.println(printingSum(n));
        // // // printNums(n);
        // // // printNumsRev(n);
        // // // printAlphaNums(str, n);
        // // System.out.println("Power of " + numForPower + " times " + timesPower);
        // // powOf2(timesPower, numForPower);
        // // System.out.println(fastExpo(timesPower, numForPower));
        // // System.out.println(sortedArrCheck(arr, 1));
        // // ArrayList<Integer> arr1 = new ArrayList<>();
        // // arr1.add(1);
        // // arr1.add(2);
        // // arr1.add(3);
        // // ArrayList<Integer> output = new ArrayList<>();
        // // subsetsArray(arr1, output, 0);
        // // int num = 5;
        // // System.out.println("Number of jumps to reach " + num + " are " +
        // // jumpStairs(num));
        // String s = "abc";
        // String outputString = "";
        // subsetString(s, outputString, 0);
        // permutationStr(s, 0);
        // int n = 3;
        // towerOfHanoi(n,'A','B','C');
        // System.out.println(testingWeirdFunc(5));
        int[] arr = { 1, 2, 3 }; // sorted array.
        int size = arr.length;
        int key = 3;
        String s = "121";
        char[] charArray = s.toCharArray();
        // System.out.println(isSortedArray(arr, size));
        // System.out.println(arraySum(arr, size));
        // System.out.println(linearSearch(arr, size, key));
        // System.out.println(linearSearchNew(arr, size, key));
        // System.out.println(binarySearchRec(arr, 0, size, key));
        // reverseString(charArray, 0, s.length() - 1);
        boolean chekcPalindrom = isPalindromeRecursion(s, 0, s.length() - 1);
        if (chekcPalindrom) {
            System.out.println("It's palindrome.");
        } else {
            System.out.println("Not a palindrome.");
        }
    }

}
