package onlyjava;

public enum EnumExamples {
    //enumerations are Constants that are also Objects.
    Amit("Tomar", 29),
    Nitin("Kumar", 28),
    Love("Kumar", 28),
    Shweta("Kumar", 28),
    Candy("Kumar", 28),
    Crush("Kumar", 28),
    Anuj("Tomar", 29);
    public final String desc;
    public final int year;

    EnumExamples(String description, int age) {
        desc = description;
        year = age;
    }

    public String getDesc() {
        return desc;
    }

    public int getYear() {
        return year;
    }
}
