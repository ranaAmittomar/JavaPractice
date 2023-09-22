import java.util.Random;

public class Arrays {
    private int tempArr[] = {2, 4, 5, 7};

    public static void basicSyntax() {
        int arr[] = new int[10]; //syntax to max array.
        arr[1] = 10;
        arr[2] = 5;
        arr[3] = 4;
        System.out.println(arr[2]); //printing array by index.(REMEMBER,WE'RE WASTING LOTS OF MEMORY HERE! WE'LL OPTIMIZE IT IN ANOTHER METHOD.)
    }

    public static void initializerArray() {
        int arr[] = {2, 4, 5, 6, 1, 8};
        System.out.println(arr[4]); //printing element at index 4->1.
    }

    public static void loopPrintArr() {
        int arr[] = {2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void tablePrint() { //printing array in table-indexing format.
        System.out.println("Index\tNumber");
        int arr[] = {2, 33, 45, 435, 26, 713, 81};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + " \t " + arr[i]);
        }
    }

    public static void arraySum() { //Array Element sum.
        int arr[] = {2, 33, 45, 435, 26, 713, 81};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The sum of array numbers is :- " + sum);
    }

    public static void randomNum() {
        Random random = new Random();
        int frequency[] = new int[7];
        for (int roll = 1; roll < 100; roll++) {
            ++frequency[1 + random.nextInt(6)];
        }
        System.out.println("Number\tTimes");
        for (int face = 1; face < frequency.length; face++) {
            System.out.println(face + "\t" + frequency[face]);
        }
    }

    public static void changeArrElem() { //changing array Element.
        int x[] = {2, 4, 5, 6};
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

    public static void multiArrayMatrix() { //printing Matrix
        int matrix[][] = {{23, 4, 5}, {2, 2, 3}, {4, 5, 6}};
        System.out.println();
        System.out.println("The Matrix is: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
