import java.util.Arrays;
import java.util.Scanner;

public class SearchAlgos {


    public boolean linearSearch(int[] arr) {
        //It's good for small dataset but not for large data set.
        //TIME COMPLEXITY:- O(n).
        Scanner input = new Scanner(System.in);
        int len = arr.length - 1;
        System.out.print("Enter Number for Linear search: ");
        int num = input.nextInt();
        for (int i = 0; i <= len; i++) {
            if (num == arr[i]) {
                return true;
            }
        }
        return false;
    }


    public boolean binarySearch(int[] arr) {//to find the target value in a given array
        //for binary search ,array should be sorted,this algo is good for returning boolean.
        //TIME COMPLEXITY:- O(n).
        Scanner input = new Scanner(System.in);
        Arrays.sort(arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.print("Enter the value for binary search in array:- ");
        int target = input.nextInt();
        int lowInd = 0;
        int highInd = arr.length - 1;
        for (int i = 0; i <= arr.length; i++) {
            int middInd = (lowInd + highInd) / 2; //we need to put inside loop because we have to calculate middle in every loop.
            if (target == arr[middInd]) {
                return true;
            } else if (target < arr[middInd]) {
                highInd = middInd - 1;

            } else {
                lowInd = middInd + 1;
            }
        }
//{1,3,4,6,7,8}
        return false;
    }

    public int[] arraysForAll() {
        int[] arr = {2, 5, 1, 7, 4, 9};
        return arr;
    }

    public static void main(String[] args) {
        SearchAlgos searchAlgos = new SearchAlgos();
        int[] k = searchAlgos.arraysForAll();
        System.out.println(searchAlgos.binarySearch(k));
        System.out.println(searchAlgos.linearSearch(k));

    }
}
