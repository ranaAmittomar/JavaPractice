package onlyjava;

//we define non static functions and we can all them from other class.
//We can make many methods private ,and then make one method to call from other class
//to hide/abstract making our class.

public class StaticFunctions {

    private int count; // Static name.
    // Below are non static functions which are being called inside MathsFuncs.java
    // class.
    static final double RANDOM_NUM;
    static {
        RANDOM_NUM = (double) Math.random();
    }

    private int count() {
        for (int i = 0; i < 2; i++) {
            count++;
        }
        return count;
    }

    private double addNum(int n) {
        return n + RANDOM_NUM + count();
    }

    public static void maxAndmin() {
        int max_num = Integer.MAX_VALUE;
        int min_num = Integer.MIN_VALUE;
        System.out.println("Max_num " + max_num + " Min_Num " + min_num);
    }

    public double getSum(int num) { // CALLED IN MATHSFUNCS.JAVA class.
        return addNum(num);
    }

}
