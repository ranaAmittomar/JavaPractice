package onlyjava;

//we define non static functions and we can all them from other class.

public class StaticFunctions {
    int count; // Static name.
    // Below are non static functions which are being called inside MathsFuncs.java
    // class.

    public int count() {
        for (int i = 0; i < 6; i++) {
            count++;
        }
        return count;
    }

    public int addNum(int n) {
        return n + count();
    }

    public int getSum(int num) {
        return addNum(num);
    }

}
