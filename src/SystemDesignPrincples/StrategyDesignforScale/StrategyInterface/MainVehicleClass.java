package SystemDesignPrincples.StrategyDesignforScale.StrategyInterface;

public class MainVehicleClass {
    public static void main(String[] args) {
        Vehicle vehicle1 = new SportsVehicle();
        vehicle1.drive();
        Vehicle vehicle2 = new NormalVehicle();
        vehicle2.drive();
    }
}
