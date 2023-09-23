public class Recursion {


    public static int numSum(int x) { //sum all num till the given number from 1.
        if (x == 1) {
            return 1;
        } else {
            return x + numSum(x - 1);
        }
    }
}
