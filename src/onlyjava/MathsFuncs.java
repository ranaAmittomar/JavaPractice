package onlyjava;

public class MathsFuncs {

    public static int[] mathsReturn(int num1, int num2) {
        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);
        return new int[] { max, min };

    }

    public static void main(String[] args) {
        StaticFunctions staticFunctions = new StaticFunctions();

        System.out.println(staticFunctions.getSum(10)); // from static func class

        int num1 = 1;
        int num2 = 3;
        for (int i : mathsReturn(num1, num2)) {
            System.out.print(i + " ");
        }
    }

}
