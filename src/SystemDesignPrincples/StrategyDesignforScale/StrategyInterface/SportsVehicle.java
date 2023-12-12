package SystemDesignPrincples.StrategyDesignforScale.StrategyInterface;

import SystemDesignPrincples.StrategyDesignforScale.StrategyInterface.interfaces.SpecialDrive;

public class SportsVehicle extends Vehicle {

    SportsVehicle() {
        super(new SpecialDrive());
    }
}
