package onlyjava;

public class StringsMethods {

    public static void loopingString() {

        String s = "Amit";
        char a = 'm';

        for (int i = 0; i < s.length(); i++) {
            if (a == s.charAt(i)) { // Compare 'm' with each character of 's'
                System.out.println("Character 'm' found at index: " + i);
                return; // Exit the loop if a match is found
            }
        }

        // If the loop completes without finding a match
        System.out.println("Character 'm' not found in the string.");
    }

    public static void main(String[] args) {
        loopingString();
    }

}
