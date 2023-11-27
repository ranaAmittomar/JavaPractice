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

    public static void substrLoopAndCheck() {

        String s = "Hello World";
        char a = 'W';
        String subString = s.substring(5);
        for (int i = 0; i < subString.length(); i++) {
            if (a == subString.charAt(i)) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("Character 'm' not found in the string.");
    }

    public static void concatString() {

        String s = "Hello";
        String newStr = s.concat(" World");
        System.out.println(newStr);

    }

    public static void equalsString() {

        String s1 = "Amit";
        String s2 = "Amit";
        boolean check = s1.equals(s2);
        System.out.println(check); // return true.
        String s3 = "Amit";
        String s4 = "Tomar";
        boolean check2 = s3.equals(s4);
        System.out.println(check2);// return false.

    }

    public static void stringAppearConvert() {
        String smalString = "AMIT";
        String capString = "tomar";
        String t = "t";
        System.out.println("Converting to lower case " + smalString.toLowerCase());
        System.out.println("Converting to upper case " + capString.toUpperCase());
        System.out.println("String concatinated : " + smalString.toLowerCase() + capString.toUpperCase());
        if (smalString.contains(t.toUpperCase())) { // checking condition for a string having inside an string.
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void sepratingBySpace() {
        String spString = "Amit Tomar World Java";
        String removeString = spString.replaceAll("\\s", "");
        System.out.println(removeString);
        // "\s" is the regular expression which represents the any white space
        // including the space,tab or new line.
        // "\\" double backslash is use to escape the backslash char in java.
    }

    public static void reverseString() {
        String s = "Amit Tomar";
        String withoutSpaceString = s.replaceAll("\\s", "");
        for (int i = withoutSpaceString.length() - 1; i >= 0; i--) {
            // also converting into UppeCase
            System.out.print(withoutSpaceString.toUpperCase().charAt(i)); // printing reverse without spaces.
        }
        System.out.println();
        for (int i = s.length() - 1; i >= 0; i--) {
            // also converting into LowerCase
            System.out.print(s.toLowerCase().charAt(i)); // printing reverse with spaces.
        }
        System.out.println();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 't') { // converting particular char into UpperCase .
                char con = s.toUpperCase().charAt(i);
                System.out.println(con); // only printing the converted char.
                return;
            }
            System.out.print(s.charAt(i)); // this prints the converted string.
        }

    }

    public static void substringWorking() {
        String str = "Amit Tomar";
        int windowSize = 3;
        String withoutSpaceString = str.replaceAll("\\s", "");
        for (int i = 0; i < withoutSpaceString.length() - windowSize; i++) {
            String subString = withoutSpaceString.substring(i, i + windowSize);
            System.out.println(subString);
        }
    }

    public static void main(String[] args) {
        // loopingString();
        // substrLoopAndCheck();
        // concatString();
        // equalsString();
        // stringAppearConvert();
        // sepratingBySpace();
        // reverseString();
        substringWorking();
    }

}
