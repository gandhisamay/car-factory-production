package Models;
import java.util.*;
import Constants.Constants;

public class AssemblyLine extends Thread {
    private HashMap<String, Integer> partsProducedByLine = new HashMap<>();
    private int currentCarNumber;
    private String currentPartBeingFixed;
    private int numberOfCarsToProduce;
    private boolean carCompletelyProduced;

    AssemblyLine(HashMap<String, Integer> partsProducedByLine, int numberOfCarsToProduce) {
        this.partsProducedByLine = partsProducedByLine;
        this.numberOfCarsToProduce = numberOfCarsToProduce;
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

    public String currentStatus() {

        StringBuffer sb = new StringBuffer();

        sb.append("Current Status \n");

        if (carCompletelyProduced) {
            sb.append(carsProducedTillNow() + " Cars Production Completed");
        } else {
            sb.append("Fixin " + currentPartBeingFixed + " in the " + currentCarNumber + "th car");
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

    public int carsProducedTillNow() {
        return currentCarNumber - 1;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        var partsByLine = partsProducedByLine.entrySet();
        var it = partsByLine.iterator();

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

        HashMap<String, Integer> partsVsTime = Constants.getPartsWithTime();

        var parts = partsVsTime.entrySet();

        // Loop for producing n cars

        for (int i = 1; i <= numberOfCarsToProduce; i++) {
            carCompletelyProduced = false;
            setCurrentCarNumber(i);

            var it = parts.iterator();


            // Fit Chassis

            while(it.hasNext()){
                Map.Entry<String, Integer> part = (Map.Entry<String, Integer>)it.next();

                final String partType = part.getKey();
                final int partTime= part.getValue();

                setCurrentPartBeingFixed(partType);
                try {
                    Thread.sleep(partTime);
                } catch (InterruptedException e) {
                    System.out.println("Process Failed while adding a " +  partType + "in car " + i);
                    continue;
                }
                System.out.println(currentStatus());
            }

            carCompletelyProduced = true;
        }
        System.out.println(currentStatus());
    }
}
