package SystemDesignPrincples.StrategyDesignforScale.StrategyInterface.interfaces;

public class SpecialDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Special Drive Strategy.");
    }
}
