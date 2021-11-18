package Models.Parts;

public class Interiors extends Part {
    public static final int FITTING_TIME = 500;  //time in milliseconds 

    Interiors(String companyName, int price, int weight) {
        super(companyName, price, weight);
    }

    private String material;

    public String getMaterial() {
        return material;
    }

}