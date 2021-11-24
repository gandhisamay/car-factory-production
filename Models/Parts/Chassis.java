package Models.Parts;

import Constants.Constants;
import Interfaces.Parts.ChassisI;
import Models.Part;

public class Chassis extends Part implements ChassisI {
    private int partType;
    private int fittingTime = 500;
    private final String partName = Constants.CHASSIS;

    public Chassis(int partType, String companyName, int price, double weight) {
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

}
