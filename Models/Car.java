package Models;

import java.util.*;

import Constants.Constants;
import Interfaces.CarI;

public class Car implements CarI{
    private static final int PRICE_VAL = 4500000;
    private static final double MILEAGE = 21;
    private HashMap<String, Integer> parts = new HashMap<>();
    

    @Override
    public double getMileage() {
        return MILEAGE;
    }

    @Override
    public int getPrice() {
        return PRICE_VAL;
    }


    @Override
    public void fixPart(String partName, int partType) {
        parts.put(partName, partType);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Car Specifications\n"); 

        Iterator<Map.Entry<String,Integer>> it = Constants.getIterator(parts);
        int i = 1;

        while (it.hasNext()) {
            Map.Entry<String, Integer> me = (Map.Entry<String, Integer>) it.next();
            sb.append(i + ". " + me.getKey() + " - " + me.getValue() + "\n");
            i++;
        }

        sb.append("\n");
        return sb.toString();
    }

}