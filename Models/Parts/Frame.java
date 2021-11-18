package Models.Parts;

public class Frame extends Part {
    private final String material = "Alloy";
    public static final int FITTING_TIME = 400;  //Fitting Time in milliseconds

    Frame(String companyName, int price, int weight){
        super(companyName, price, weight);
    }

    public String getMaterial() {
        return material;
    }

}
