import java.util.Scanner;

public class StringsQues {

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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a string (or 'q' to quit): ");
            String s = input.nextLine();

            if (s.equalsIgnoreCase("q")) {
                System.out.println("Exiting the program.");
                break; // Exit the loop if the user enters 'q'
            }

            if (isPalindrome(s)) {
                System.out.println("It's a palindrome!");
            } else {
                System.out.println("It's not a palindrome.");
            }
        }
        input.close(); //it's best practice to close the I/O method when done,it ensures there won't ny leakage.

    }

}
