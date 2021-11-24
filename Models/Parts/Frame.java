package Models.Parts;

import Constants.Constants;
import Interfaces.Parts.FrameI;
import Models.Part;

public class Frame extends Part implements FrameI{
    private final String material = "Alloy";
    private int fitingTime = 600;  //Fitting Time in milliseconds
    private int partType;
    private final String partName = Constants.FRAME;
    

    public Frame(int partType, String companyName, int price, double weight) {
        super(companyName, price, weight);
        this.partType = partType;
    }

    public String getPartName() {
        return partName;
    }

    public int getFitingTime() {
        return fitingTime;
    }

    public void setFitingTime(int fitingTime) {
        this.fitingTime = fitingTime;
    }

    public int getPartType() {
        return partType;
    }

    public void setPartType(int partType) {
        this.partType = partType;
    }

    public String getMaterial() {
        return material;
    }

}
