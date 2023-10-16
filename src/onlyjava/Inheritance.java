package onlyjava;

//Basically, if we write any method inside a child class which is being overriden and calling it,then first the object will print the
//overridden method else if not overridden ,then the object will pick the method of parent class,and print that.


class ComputerGrandpa {
    public void code() {
        System.out.println("I am grandpa");
    }
}

class ComputerParentClass extends ComputerGrandpa { //Parent Class.
    public void code() {
        System.out.println("I am Computer Parent Class.");
    }
}


class Laptop extends ComputerParentClass {
    public void code() {
        System.out.println("Coding from Laptop class...");
    }
}

class Desktop extends ComputerParentClass {
    public void code() {
        System.out.println("Coding from desktop class...");
//    }
    }
}

class ads {
    public void run(ComputerGrandpa la) {
        la.code();
    }
}

public class Inheritance {
    public static void main(String[] args) {

        ComputerParentClass computerParentClass = new ComputerParentClass();
        ComputerParentClass laptop = new Laptop(); //getting object from laptop class.
        ComputerParentClass desktop = new Desktop();
        ComputerGrandpa computerGrandpa = new ComputerGrandpa();
        ads ads = new ads();  //running the onlyjava.ads class by passing object from demo class.
        ads.run(desktop);
        System.out.println("------------");
        desktop.code();
        System.out.println("-------------");
        ads.run(computerGrandpa);
    }
}
