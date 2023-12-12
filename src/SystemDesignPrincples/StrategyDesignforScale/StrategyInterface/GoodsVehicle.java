package SystemDesignPrincples.StrategyDesignforScale.StrategyInterface;

import SystemDesignPrincples.StrategyDesignforScale.StrategyInterface.interfaces.NormalDrive;

public class GoodsVehicle extends Vehicle {
    GoodsVehicle() {
        super(new NormalDrive());
    }
}
