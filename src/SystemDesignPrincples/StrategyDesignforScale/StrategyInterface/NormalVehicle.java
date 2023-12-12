package SystemDesignPrincples.StrategyDesignforScale.StrategyInterface;

import SystemDesignPrincples.StrategyDesignforScale.StrategyInterface.interfaces.NormalDrive;

public class NormalVehicle extends Vehicle {
    NormalVehicle() {
        super(new NormalDrive());
    }
}
