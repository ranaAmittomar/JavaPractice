package onlyjava;

public class Enum {
    public enum WeekDay {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }

    public static void main(String[] args) {
        System.out.println("Iterating over the weeks in enum : ");
        for (WeekDay weekDay : WeekDay.values()) {
            System.out.print(weekDay + " ");
        }
        //using switch statement.
        WeekDay today = WeekDay.MONDAY;
        switch (WeekDay.FRIDAY) {
            case TUESDAY:
                System.out.println("\nIt's tuesday");
                break;
            case FRIDAY:
                System.out.println("\nIt's Friday");
                break;
            default:
                System.out.println("\nIt's Monday");
        }
    }
}
