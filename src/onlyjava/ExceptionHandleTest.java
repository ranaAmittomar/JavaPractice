package onlyjava;

import java.util.ArrayList;
import java.util.List;

public class ExceptionHandleTest {

    public static void ageCheck(int[] age) {

        List<Integer> ages = new ArrayList<>();
        for (int x : age) {
            try {
                if (x < 18) {
                    if (x > 15) {
                        System.out.println("Your age is under 15 to 17: Wait for 2 years");
                    } else if (x < 15) { //intentional error.
                        throw new Exception(new Exception().getMessage() + "You're too young");
                    }
                } else {
                    int a = x % 10;
                    ages.add(a);
                }
            } catch (Exception exception) {
                System.err.println("An error occurred: " + exception.getMessage());
            }
        }
        System.out.println(ages);

    }

    public static void main(String[] args) {
        int[] ages = {20, 21, 23, 4};
        ageCheck(ages);
    }

}
