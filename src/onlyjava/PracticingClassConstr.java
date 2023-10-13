package onlyjava;

public class PracticingClassConstr {
    private String girlName; //Instantiate of class,because it's only available to use within this class & in methods but not in other classes.

    public PracticingClassConstr(String name) { //constructor! The name of constructor has to be same as name of Class.
        girlName = name;
    }

    public void setGirlName(String name) {
        girlName = name;
    }

    public String getGirlName() {
        return girlName;
    }

    public void saying() {
        System.out.println("Hello " + getGirlName());
    }
}
