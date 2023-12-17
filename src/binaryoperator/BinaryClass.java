package binaryoperator;

public class BinaryClass {

    public static void orOperator() {
        int a = 5;
        int b = 3;
        System.out.println(a | b);
        System.out.println(a >> 2);
    }

    public static void andOperator() {
        int a = 5;
        int b = 3;
        System.out.println(a & b);
    }

    public static void main(String[] args) {
        orOperator();
        andOperator();
    }
}
