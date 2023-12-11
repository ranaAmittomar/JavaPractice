package SystemDesignPrincples.solidprinciple;

import java.util.*;

class Vehicle {
    public Integer getNumberOfWheels() {
        return 2;
    }
}

class Bicycle extends Vehicle {

}

class EngineVehicle extends Vehicle {
    public boolean hasEngine() {
        return true;
    }
}

/**
 * Car
 */
class Car extends EngineVehicle {

    @Override
    public Integer getNumberOfWheels() {

        return 4;
    }

}

/**
 * MotorCycle
 */
class MotorCycle extends EngineVehicle {

}

public class Liskov {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Bicycle());
        vehicleList.add(new Car());
        vehicleList.add(new MotorCycle());
        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle.getNumberOfWheels().toString());
        }
    }

}
