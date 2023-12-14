package SystemDesignPrincples.StrategyDesignforScale.StrategyInterface;

import SystemDesignPrincples.StrategyDesignforScale.StrategyInterface.interfaces.SpecialDrive;

public class OffRoadVehicle extends Vehicle {
    OffRoadVehicle(){
        super (new SpecialDrive());
    }
}
