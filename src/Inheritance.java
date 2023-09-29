public class Inheritance {
    public static void main(String[] args) {

        ComputerParentClass computerParentClass = new ComputerParentClass();
        ComputerParentClass laptop = new Laptop(); //getting object from laptop class.
        ComputerParentClass desktop = new Desktop();
        ads ads = new ads(); //running the ads class by passing object from demo class.
        ads.run(laptop);
    }
}

class ComputerParentClass { //Parent Class.
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
    }
}

class ads {
    public void run(ComputerParentClass la) {
        la.code();
    }
}