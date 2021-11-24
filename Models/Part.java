package Models;

public class Part{ 
    private String companyName;
    private int price;
    private double weight;

    Part(){};

    public Part(String companyName, int price, double weight){
        this.companyName = companyName;
        this.price = price;
        this.weight = weight;
    }


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}