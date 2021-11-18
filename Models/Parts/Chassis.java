package Models.Parts;

public class Chassis extends Part {
    private final String metal = "Aluminium";
    public static final int FITTING_TIME = 600;  //Fitting Time in milliseconds

    Chassis(String companyName, int price, int weight){
        super(companyName, price, weight);
    }

    public String getMetal() {
        return metal;
    }

}
