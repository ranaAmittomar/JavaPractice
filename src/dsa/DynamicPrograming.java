package dsa;

import java.util.Scanner;

public class DynamicPrograming {

    public static int fibNum(int n, int[] dp) { // top-down approach using recursion.
        if (n <= 1) return n;
        if (dp[n] != -1) return dp[n];
        dp[n] = fibNum(n - 1, dp) + fibNum(n - 2, dp);
        return dp[n];

    }

    public static int bottomUpFib(int n, int[] dp) {
        if (n == 0) return 0;
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];

    }

    public static void moreOptFib(int n) {
        int prev1 = 1;
        int prev2 = 0;
        if (n == 0) System.out.println("0");

        for (int i = 2; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        System.out.println(prev1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the fibonacci number you want : ");
        int n = sc.nextInt();

        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }
        System.out.println(fibNum(n, dp));
        System.out.println(bottomUpFib(n, dp));
        moreOptFib(n);
    }
}
