package SystemDesignPrincples.StrategyDesignforScale.StrategyInterface.interfaces;

public class NormalDrive implements DriveStrategy {
    @Override
    public void drive() {

        System.out.println("Normal Drive Capabilities.");
    }
}
