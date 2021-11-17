package Models;
import java.util.*;

public class AssemblyLine implements Runnable{
    private HashMap<String, Integer> partsProducedByLine = new HashMap<>();
    private int currentCarNumber;
    private String currentPartBeingFixed;
    private int numberOfCarsToProduce;
    private boolean carCompletelyProduced;

    public void setPartsProducedByLine(HashMap<String, Integer> partsProducedByLine) {
        this.partsProducedByLine = partsProducedByLine;
    }
    public int getCurrentCarNumber() {
        return currentCarNumber;
    }
    public void setCurrentCarNumber(int currentCarNumber) {
        this.currentCarNumber = currentCarNumber;
    }
    public String getCurrentPartBeingFixed() {
        return currentPartBeingFixed;
    }
    public void setCurrentPartBeingFixed(String currentPartBeingFixed) {
        this.currentPartBeingFixed = currentPartBeingFixed;
    }
    public int getNumberOfCarsToProduce() {
        return numberOfCarsToProduce;
    }
    public void setNumberOfCarsToProduce(int numberOfCarsToProduce) {
        this.numberOfCarsToProduce = numberOfCarsToProduce;
    }

    public String currentStatus(){
        carCompletelyProduced = false;
        StringBuffer sb = new StringBuffer();

        sb.append("Current Status \n");

        if(carCompletelyProduced){
            sb.append(carsProducedTillNow() + " Cars Production Completed");
        } 
        else{
            sb.append("Fixing " + currentPartBeingFixed + " in the " + currentCarNumber + "th car");
        }

        return sb.toString();
    }

    public String getAssemblyDetails(){
        StringBuffer sb = new StringBuffer();
        var partsByLine = partsProducedByLine.entrySet();
        var it = partsByLine.iterator();

        sb.append("Assembly Line Specs\n");
        sb.append("Part - Type of Part\n");

        int i = 1;

        while(it.hasNext()){
            Map.Entry<String, Integer> me = (Map.Entry<String, Integer>)it.next();
            sb.append(i + ". " + me.getKey() + " - " + me.getValue() + "\n");
            i++;
        } 

        return sb.toString();
    }

    public int carsProducedTillNow(){
        return currentCarNumber-1;
    }

    @Override 
    public String toString(){
        StringBuffer sb = new StringBuffer();
        var partsByLine = partsProducedByLine.entrySet();
        var it = partsByLine.iterator();

        sb.append("Assembly Line Specs\n");
        sb.append("Format : part - type of part\n");

        int i = 1;

        while(it.hasNext()){
            Map.Entry<String, Integer> me = (Map.Entry<String, Integer>)it.next();
            sb.append(i + ". " + me.getKey() + " - " + me.getValue() + "\n");
            i++;
        }
        
        sb.append("\n");

        sb.append(currentStatus());

        return sb.toString();
    }

    @Override
    public void run() {
        
    }
}
