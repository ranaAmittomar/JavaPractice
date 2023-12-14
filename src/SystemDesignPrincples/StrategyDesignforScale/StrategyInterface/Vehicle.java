package SystemDesignPrincples.StrategyDesignforScale.StrategyInterface;

import SystemDesignPrincples.StrategyDesignforScale.StrategyInterface.interfaces.DriveStrategy;

public abstract class Vehicle {
    /*
     * We will now create anything like
     * DriveStrategy obj1 = new NormalDrive();
     * DriveStrategy obj2 = new SpecialDrive();
     * DriveStrategy obj3 = new XyzDrive();
     * Because ,if we do this, I'll Have to create the object everytime there is
     * another
     * class implementing the method.
     * So, We should use the below CONSTRUCTOR INJECTION technique to avoid that obj
     * creation.
     * And most importantly it's dynamic ..
     */
    DriveStrategy driveStrat;

    // this is known as the Constructor Injection.
    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrat = driveStrategy;
    }

    public void drive() {
        driveStrat.drive();
    }
}
