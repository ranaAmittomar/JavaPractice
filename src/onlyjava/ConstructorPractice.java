package onlyjava;

class Parent {
    int var1 = 10;

    Parent() {
        System.out.println("Default Constructor Parent Class");
        System.out.println(var1);
    }

    Parent(int var) {
        this.var1 = var;
    }

    public void foo() {
        System.out.println("Parent Class Foo");
    }
}

public class ConstructorPractice extends Parent {
    // int var1 = 5;

    ConstructorPractice() {
        super();
        super.var1 = 20;
        System.out.println("Default Constructor Call Child Class");
    }

    public void printNums() {
        super.foo();
        System.out.println(super.var1);
    }

    @Override
    public void foo() {
        System.out.println("Child Class Foo");
    }

    public static void main(String[] args) {
        ConstructorPractice constructorPractice = new ConstructorPractice();
        // constructorPractice.superCalls();
        constructorPractice.printNums();
        constructorPractice.foo();
    }
}
