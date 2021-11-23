package Models;

import java.util.*;
import Constants.Constants;

public class AssemblyLine extends Thread {
    private HashMap<String, Integer> partsProducedByLine = new HashMap<>();
    private int currentCarNumber;
    private String currentPartBeingFixed;
    private int numberOfCarsToProduce;
    private boolean carCompletelyProduced;
    private int assemblyLineNum;

    AssemblyLine(HashMap<String, Integer> partsProducedByLine, int numberOfCarsToProduce, int assemblyLineNum) {
        this.partsProducedByLine = partsProducedByLine;
        this.numberOfCarsToProduce = numberOfCarsToProduce;
        this.assemblyLineNum = assemblyLineNum;
    }

    public int getAssemblyLineNum() {
        return assemblyLineNum;
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

    public int carsProducedTillNow() {
        return currentCarNumber - 1;
    }

    public void fixPart(String partName, int partTime, int carNum, Car car) throws InterruptedException {
        Thread.sleep(partTime);
        car.fixPart(partName, partsProducedByLine.get(partName));
    }

    public String currentStatus() {

        StringBuffer sb = new StringBuffer();

        if (carCompletelyProduced) {
            
            // sb.append("Production Complete \n");
            sb.append(carsProducedTillNow() + " Cars Production Completed at Assembly Line " + assemblyLineNum);
            sb.append("\n");
        } else {
            
            // sb.append("Current Status \n");
            sb.append("Fixing " + currentPartBeingFixed + " in the " + currentCarNumber + "th car at Assembly Line "
                    + assemblyLineNum);
            sb.append("\n");
        }

        return sb.toString();
    }

    public String getAssemblyDetails() {
        StringBuffer sb = new StringBuffer();
        var partsByLine = partsProducedByLine.entrySet();
        var it = partsByLine.iterator();

        sb.append("Assembly Line Specs\n");
        sb.append("Part - Type of Part\n");

        int i = 1;

        while (it.hasNext()) {
            Map.Entry<String, Integer> me = (Map.Entry<String, Integer>) it.next();
            sb.append(i + ". " + me.getKey() + " - " + me.getValue() + "\n");
            i++;
        }

        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        Iterator<Map.Entry<String,Integer>> it = Constants.getIterator(partsProducedByLine);

        sb.append("Assembly Line Specs\n");
        sb.append("Format : part - type of part\n");

        int i = 1;

        while (it.hasNext()) {
            Map.Entry<String, Integer> me = (Map.Entry<String, Integer>) it.next();
            sb.append(i + ". " + me.getKey() + " - " + me.getValue() + "\n");
            i++;
        }

        sb.append("\n");

        sb.append(currentStatus());

        return sb.toString();
    }

    @Override
    public void run() {
        // Order of fitting parts
        // 1) Chassis
        // 2) Frame
        // 3) Engine
        // 4) Colors
        // 5) Interiors

        // Loop for producing n cars

        for (int i = 1; i <= numberOfCarsToProduce; i++) {
            carCompletelyProduced = false;
            setCurrentCarNumber(i);
            Iterator<Map.Entry<String,Integer>> it = Constants.getIterator(Constants.getPartsWithTime());

            //Create a new Car Model
            Car car = new Car();

            // Fit parts

            while (it.hasNext()) {
                Map.Entry<String, Integer> part = (Map.Entry<String, Integer>) it.next();

                final String partType = part.getKey();
                final int partTime = part.getValue();

                try {
                    fixPart(partType, partTime, i, car);
                } catch (InterruptedException e) {
                    System.out.println("Process Failed while adding a " + partType + "in car " + i);
                    continue;
                }

                setCurrentPartBeingFixed(partType);
                System.out.println(currentStatus());
            }

            carCompletelyProduced = true;
        }
        setCurrentCarNumber(numberOfCarsToProduce + 1);
        System.out.println("PRODUCTION COMPLETE!");
    }
}
