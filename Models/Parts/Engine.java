package Models.Parts;

import Constants.Constants;
import Interfaces.Parts.EngineI;
import Models.Part;

public class Engine extends Part implements EngineI{

    private final double power = 10;
    private final double pickupTime = 8;
    private int fittingTime = 400;  //Fitting Time in milliseconds
    private int partType;
    private final String partName = Constants.ENGINE;

    public Engine(int partType, String companyName, int price, double weight) {
        super(companyName, price, weight);
        this.partType = partType;
    }

    public String getPartName() {
        return partName;
    }

    public int getFittingTime() {
        return fittingTime;
    }

    public void setFittingTime(int fittingTime) {
        this.fittingTime = fittingTime;
    }

    public int getPartType() {
        return partType;
    }

    public void setPartType(int partType) {
        this.partType = partType;
    }

    public double getPickupTime() {
        return pickupTime;
    }

    public double getPower() {
        return power;
    }

}
