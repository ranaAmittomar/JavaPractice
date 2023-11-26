package dsa;

import java.util.Scanner;

public class StringsQues {

    public static void strFuncs() {
        String splitString = "My name is Amit,You are good";
        System.out.println("The Length of string is: " + splitString.length());
        String[] words = splitString.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

    }

    private static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static char convert(char character) { // convert the small character in capital character.
        char ans;
        ans = (char) (character - 'a' + 'A');
        return ans;
    }

    public static void addBinary() { // adding binary digits as string and returning their result as string
        String one = "11";
        String two = "101";
        int carry = 0;
        String result = "";
        int oneLen = one.length();
        int twoLen = two.length();
        int i = 0;
        while (i < oneLen || i < twoLen || carry != 0) {
            int x = 0;
            if (i < oneLen && one.charAt(oneLen - 1 - i) == '1') {
                x = 1;
            }
            int y = 0;
            if (i < twoLen && two.charAt(twoLen - 1 - i) == '1') {
                y = 1;
            }
            result = (x + y + carry) % 2 + result;
            carry = (x + y + carry) / 2;
            i++;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // while (true) {
        // System.out.print("Enter a string (or 'q' to quit): ");
        // String s = input.nextLine();

        // if (s.equalsIgnoreCase("q")) {
        // System.out.println("Exiting the program.");
        // break; // Exit the loop if the user enters 'q'
        // }

        // if (isPalindrome(s)) {
        // System.out.println("It's a palindrome!");
        // } else {
        // System.out.println("It's not a palindrome.");
        // }
        // }
        // char char1 = input.next().charAt(0);
        // System.out.println("The character of " + char1 + " is " + convert(char1));
        // strFuncs();

        // input.close(); // it's best practice to close the I/O method when done,it
        // ensures there won't
        // // do any memory leakage.
        // }
        addBinary();

    }
}
