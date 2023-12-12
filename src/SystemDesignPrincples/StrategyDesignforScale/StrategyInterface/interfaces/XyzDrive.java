package SystemDesignPrincples.StrategyDesignforScale.StrategyInterface.interfaces;

public class XyzDrive implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("XYZ Capability");
    }

}
