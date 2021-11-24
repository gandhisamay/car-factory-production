package Models.Parts;

import Constants.Constants;
import Interfaces.Parts.WheelI;
import Models.Part;

public class Wheel extends Part implements WheelI{
    private int fittingTime = 100;  //Fitting Time in milliseconds
    private int partType;
    private final String partName = Constants.WHEEL;

    public Wheel(int partType, String companyName, int price, double weight) {
        super(companyName, price, weight);
        this.partType = partType;
    }

    public String getPartName() {
        return partName;
    }

    public int getFitingTime(){
        return fittingTime;
    }

    public void setFitingTime(int fittingTime){
        this.fittingTime = fittingTime;
    }

    public int getPartType() {
        return partType;
    }

    public void setPartType(int partType) {
        this.partType = partType;
    } 
}
