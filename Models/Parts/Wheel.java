package Models.Parts;
public class Wheel extends Part{
    public static final int FITTING_TIME = 250;  //Fitting Time in milliseconds

    Wheel(String companyName, int price, int weight){
        super(companyName, price, weight);
    } 
}
