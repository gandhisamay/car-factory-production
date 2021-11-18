package Models.Parts;
import Interfaces.PartI;

public class Part implements PartI{ 
    public String companyName;
    public int price;
    public int weight;

    Part(String companyName, int price, int weight){
        this.companyName = companyName;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public String getCompanyName() {
        return companyName;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}