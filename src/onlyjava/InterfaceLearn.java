package onlyjava;

import java.util.Scanner;

//implementing the interface.
interface InterfaceLearn {

    int age = 30; //Variables are always final and static.

    void input(); //public & abstract

    void output(); //public & abstract.
}

//we can even make multiple interfaces and the class can implements multiple interface.
//Also,interfaces can inherit other interfaces.
interface anotherInterface extends InterfaceLearn {
    void anotherINTR();
}

class Dev implements InterfaceLearn, anotherInterface {
    String name;
    int sal;

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name : ");
        name = input.nextLine();
        System.out.print("Enter your salary : ");
        sal = input.nextInt();
    }


    public void output() {
        if (sal <= age) {
            System.out.println("Your age and salary are equal.");
        } else
            System.out.println("Hello " + name + " salary is " + sal);
        System.out.println(InterfaceLearn.age); //we can use interface variable directly without object creating as they are Static in interface.
    }

    public void anotherINTR() {
        InterfaceLearn obj = new Dev();
        System.out.println("It's inside anotherInter method but outputting output method from first interface.");
        obj.output();
        System.out.println("Hello from anotherINTR interface.");
    }

    public static void main(String[] args) {
        Dev obj = new Dev();
        obj.input();
        obj.output();
        obj.anotherINTR();
    }
}

