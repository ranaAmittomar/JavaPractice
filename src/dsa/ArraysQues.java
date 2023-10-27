package dsa;

import java.util.*;

public class ArraysQues {
    private int tempArr[] = { 2, 4, 5, 7 };

    public void basicSyntax() {
        int[] arr = new int[10]; // syntax to max array.
        arr[1] = 10;
        arr[2] = 5;
        arr[3] = 4;
        System.out.println("from basicSyntax method: " + arr[2]); // printing array by index.(REMEMBER,WE'RE WASTING
        // LOTS OF MEMORY HERE! WE'LL OPTIMIZE IT IN ANOTHER
        // METHOD.)
    }

    public void initializerArray() {
        int[] arr = { 2, 4, 5, 6, 1, 8 };
        System.out.println(arr[4]); // printing element at index 4->1.
    }

    public void loopPrintArr() {
        int[] arr = { 2, 3, 4, 5, 6, 7, 8 };
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public void tablePrint() { // printing array in table-indexing format.
        System.out.println("Index\tNumber");
        int[] arr = { 2, 33, 45, 435, 26, 713, 81 };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + " \t " + arr[i]);
        }
    }

    public void arraySum() { // Array Element sum.
        int[] arr = { 2, 33, 45, 435, 26, 713, 81 };
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("The sum of array numbers is :- " + sum);
    }

    public void randomNum() {
        Random random = new Random();
        int[] frequency = new int[7];
        for (int roll = 1; roll < 100; roll++) {
            ++frequency[1 + random.nextInt(6)];
        }
        System.out.println("Number\tTimes");
        for (int face = 1; face < frequency.length; face++) {
            System.out.println(face + "\t" + frequency[face]);
        }
    }

    public void changeArrElem() { // changing array Element.
        int[] x = { 2, 4, 5, 6 };
        System.out.print("Before addition the array is:- ");
        for (int t : x) {
            System.out.print(t + " ");
        }
        System.out.println();
        System.out.print("After the addition ,the array is:- ");
        for (int l : x) {
            System.out.print((l += 5) + " ");
        }
    }

    public void multiArrayMatrix() { // printing Matrix
        int[][] matrix = { { 23, 4, 5 }, { 2, 2, 3 }, { 4, 5, 6 } };
        System.out.println();
        System.out.println("The Matrix is: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    // Finding the median in an Array
    public void medianFind() {
        System.out.println();
        int[] medianFindArray = { 2, 10, 5, 6, 7, 8, 9, 12, 41, 12 };
        if (medianFindArray.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        java.util.Arrays.sort(medianFindArray);
        System.out.print("The sorted array is:- ");
        for (int x : medianFindArray) {
            System.out.print(x + " ");
        }
        System.out.println();
        int n = medianFindArray.length;
        if (n % 2 == 0) {
            int middleIndex = n / 2;
            int middle1 = medianFindArray[middleIndex - 1];
            int middle2 = medianFindArray[middleIndex];
            int median = (middle1 + middle2) / 2;
            System.out.print("The median:- " + median);
        } else {
            int middleIndex = n / 2;
            int median = medianFindArray[middleIndex];
            System.out.print("The median:- " + median);
        }
        System.out.println();
    }

    public void usingArrayList() { // using ArrayList, like vectors from C++.
        List<Integer> integerList = new ArrayList<Integer>();
        System.out.println("From List Func");
        integerList.add(2);
        integerList.add(0);
        integerList.add(6);
        integerList.add(7);
        integerList.add(1);
        System.out.println("Index of 6 before sort:- " + integerList.indexOf(6));
        Collections.sort(integerList);
        System.out.println("Index of 6 after sort:- " + integerList.indexOf(6));
        System.out.println("Sorted List:- " + integerList);

    }

    public void arrayMethods() {
        int[] arr = { 1, 2, 3, 4, 0, 10 };
        System.out.println(arr.length);
        Arrays.sort(arr);
        for (int x : arr) {
            System.out.println(x);
        }
    }

    public int[] sortItUp() { // Question Asked by google/meta/paytm.
        int[] arr = { 0, 1, 1, 1, 0, 0, 0, 2, 2, 2, 2, 2, 1, 1, 0 };
        int left_bound = 0;
        int right_bound = arr.length - 1;
        int current = 0;
        while (current <= right_bound) {
            if (arr[current] == 2) {
                arr[current] = arr[right_bound];
                arr[right_bound] = 2;
                right_bound -= 1;
            } else if (arr[current] == 1) {
                current += 1;
            } else {
                arr[current] = arr[left_bound];
                arr[left_bound] = 0;
                left_bound += 1;
                current += 1;
            }
        }
        return arr;
    }

    public static void isSorted() {
        int[] arr = { 1, 2, 3, 4, 5 };

        for (int i = 1; i <= arr.length - 1; i++) {
            if (arr[i] > arr[i - 1]) {
                System.out.println("Sorted " + arr[i]);
            } else {
                System.out.println("Not Sorted");
            }
        }

    }

    public void uniqueNum() {
        int[] arr = { 2, 2, 4, 4, 5, 5, 1 };

        int uniqueVar = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            uniqueVar = uniqueVar ^ arr[i];
        }
        System.out.println("Unique Variable is: " + uniqueVar);
    }

    public static int trapRainningWater(int[] arr, int arrSize) { // brute force
        // COMMENTED OUT SOME PRINT STATEMENTS FOR DEBUGGING PROECESS AND LOOP
        // UNDERSTANDING.
        int res = 0;
        int left, right;
        for (int i = 1; i < arrSize - 1; i++) {
            left = arr[i];
            // System.out.println("inside I loop left val: " + left);
            for (int j = 0; j < i; j++) {
                left = Math.max(left, arr[j]);
                // System.out.println("Inside left loop val " + left);
            }
            // System.out.println("Final left max val: " + left);
            right = arr[i];
            // System.out.println("inside I loop right val: " + right);

            for (int j = i + 1; j < arrSize; j++) {
                right = Math.max(right, arr[j]);
                // System.out.println("inside right loop val: " + right);
            }
            // System.out.println("Final right max val: " + right);

            res += Math.min(left, right) - arr[i];
            System.out.println("Res value changing in every iteration: " + res);
            // System.out.println("Left Max: " + left);
            // System.out.println("Right Max: " + right);

        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 0, 2, 0, 4 };
        int n = arr.length;
        System.out.println(trapRainningWater(arr, n));
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // isSorted();
    }

}
