package onlyjava;

public class MathsFuncs {

    static final double PI = 3.14324; // this won't change.

    public static int[] mathsReturn(int num1, int num2) {
        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);
        return new int[] { max, min };

    }

    public static int divideNum(int num1, int num2) {
        try {
            return num1 / num2;
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic Exception: " + e);
            // Perform an alternative action or calculation
            return handleArithmeticError(num1, num2); // EXCEPTION
        }
    }

    private static int handleArithmeticError(int num1, int num2) {
        if (num2 != 0) {
            return num2 / num1;
        } else {
            return 0;
        }
    }

    public static void logFuncs() {
        int n = 10;
        System.out.println(Math.log(n));
        System.out.println("Log base 10: " + Math.log10(n)); // base 10
    }

    public static void moreMathsFuncs() {
        int n = 4;
        System.out.println("Power of 5 for 10 is : " + Math.pow(n, 2));
        System.out.println("Exponential of 10 is : " + Math.exp(1));
        System.out.println("Square root of " + n + " is:" + Math.sqrt(n));
    }

    public static void main(String[] args) {
        /*
         * StaticFunctions staticFunctions = new StaticFunctions();
         * System.out.println(staticFunctions.getSum(22) + PI); // from static func
         * class
         * StaticFunctions.maxAndmin();
         * int formatNum = 100000000;
         * int num1 = 1;
         * int num2 = 3;
         * for (int i : mathsReturn(num1, num2)) {
         * System.out.print(i + " ");
         * }
         * System.out.println("\n" + MathsFuncs.PI);
         * String s = String.format("%,d, ", formatNum); // String formatting.
         * System.out.println(s);
         * System.out.println(String.format("I have %,.2f bugs to fix", 32.556789));
         * System.out.println(String.format("I have %x hexadecimal to fix", 42));
         * System.out.println(String.format("I have '%c' characters to fix", 67));
         * System.out.println(divideNum(2, 0));
         */
        logFuncs();
        moreMathsFuncs();
    }
}
