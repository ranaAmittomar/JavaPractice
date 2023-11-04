package onlyjava;

//Multiple inheritance is allowed in java but in HIERARCHICAL MANNER..

interface f {
    void display();

    void love();
}

class A implements f {

    @Override
    public void display() {
        System.out.println("From class A");
    }

    @Override
    public void love() {
        System.out.println("Love");
    }
}

class B extends A {
    @Override
    public void display() {
        System.out.println("From Class B");
    }
}

class C extends B {
    @Override
    public void display() {
        System.out.println("From Class C");
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {
        C x = new C();
        x.display();
        x.love();
    }

}
