package Models.Parts;

import Constants.Constants;
import Interfaces.Parts.InteriorsI;
import Models.Part;

public class Interiors extends Part implements InteriorsI{
    private int fittingTime = 450;  //time in milliseconds 
    private int partType;
    private final String partName = Constants.INTERIORS;

    public Interiors(int partType, String companyName, int price, double weight) {
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

    private String material;

    public String getMaterial() {
        return material;
    }

}