package Interfaces.Parts;

public interface EngineI {
    String getPartName();
    int getFittingTime();
    void setFittingTime(int fittingTime);
    int getPartType();
    void setPartType(int partType);
    double getPickupTime();
    double getPower();
}
