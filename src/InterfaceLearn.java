import java.util.Scanner;
//implementing the interface.
interface InterfaceLearn {

    int age = 30; //Variables are always final and static.

    void input(); //public & abstract

    void output(); //public & abstract.
}

class Dev implements InterfaceLearn {
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

    public static void main(String[] args) {
        InterfaceLearn obj = new Dev();
        obj.input();
        obj.output();
    }
}

