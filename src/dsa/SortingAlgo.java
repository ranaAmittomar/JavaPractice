package dsa;

public class SortingAlgo {

    public static void main(String[] args) {
        bubbleSort();
        mergeSort();
        selectionSort();
        insertionSort();
    }

    private static void insertionSort() {
    }

    private static void selectionSort() {
    }

    private static void mergeSort() {
    }

    public static void bubbleSort() { //bubble sort(compare adjacent element.)
        int[] arr = {2, 1, 4, 6, 9, 67, 87};
        System.out.print("Array before sort:- ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.print("\nArray after sort:- ");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

}
