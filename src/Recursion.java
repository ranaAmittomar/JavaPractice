
public class Recursion {

    public static int fib(int n) {

        int[] memo = new int[1000];

        if (n <= 1) {
            return n;
        }
        if (memo[n] != 0) {
            return memo[n];
        }

        else {
            memo[n] = fib(n - 1) + fib(n - 2);
            return memo[n];
        }

    }

    public static void main(String[] args) {

        int n=6;
        System.out.println(fib(10));
    }

}
