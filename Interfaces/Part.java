package Interfaces;
public interface Part {
    void fixPart();
    double getFittingTime();
    String getCompanyName();
    int getPrice();
    double getWeight();
    
    @Override
    String toString();
}
 