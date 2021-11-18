package Models.Parts;

public class Engine extends Part {

    private final double power = 10;
    private final double pickupTime = 8;
    public static final int FITTING_TIME = 250;  //Fitting Time in milliseconds

    Engine(String companyName, int price, int weight){
        super(companyName, price, weight);
    }

    public double getPickupTime() {
        return pickupTime;
    }

    public double getPower() {
        return power;
    }

}
