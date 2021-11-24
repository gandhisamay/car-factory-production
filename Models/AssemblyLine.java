package Models;

import Constants.Constants;
import Models.Parts.Chassis;
import Models.Parts.Color;
import Models.Parts.Engine;
import Models.Parts.Frame;
import Models.Parts.Interiors;
import Models.Parts.Wheel;

public class AssemblyLine extends Thread {
    // private HashMap<String, Part> partsProducedByLine = new HashMap<>();

    private Chassis chassis;
    private Color color;
    private Engine engine;
    private Frame frame;
    private Interiors interiors;
    private Wheel wheel;
    private int currentCarNumber;
    private String currentPartBeingFixed;
    private int numberOfCarsToProduce;
    private boolean carCompletelyProduced;
    private int assemblyLineNum;

    AssemblyLine(Chassis chassis, Color color, Engine engine, Interiors interiors, Frame frame, Wheel wheels,
            int numberOfCarsToProduce, int assemblyLineNum) {
        this.chassis = chassis;
        this.color = color;
        this.engine = engine;
        this.interiors = interiors;
        this.frame = frame;
        this.wheel = wheels;
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

    public void currentStatus() {

        StringBuffer sb = new StringBuffer();
        if (carCompletelyProduced) {
            sb.append(carsProducedTillNow() + " Cars Production Completed at Assembly Line " + assemblyLineNum);
        } else {
            sb.append("Fixing " + currentPartBeingFixed + " in the " + currentCarNumber + "th car at Assembly Line "
                    + assemblyLineNum);
        }

        System.out.println(sb);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append("Assembly Line Specs\n");
        sb.append("Format : part - type of part\n");
        sb.append("1. " + chassis.getPartName() +  " " + chassis.getPartType());
        sb.append("2. " + frame.getPartName() +  " " + chassis.getPartType());
        sb.append("3. " + engine.getPartName() +  " " + chassis.getPartType());
        sb.append("4. " + interiors.getPartName() +  " " + chassis.getPartType());
        sb.append("5. " + "Interior Color: " + color.getInteriorColor() + " Frame Color: " + color.getFrameColor());
        sb.append("\n");

        return sb.toString();
    }

    @Override
    public void run() {
        // Order of fitting parts
        // 1) Chassis
        // 2) Frame
        // 3) Engine
        // 4) Interiors
        // 5) Colors

        // Loop for producing n cars

        for (int i = 1; i <= numberOfCarsToProduce; i++) {
            carCompletelyProduced = false;
            setCurrentCarNumber(i);

            // Create a new Car Model
            Car car = new Car();

            // Fit parts
            try {

                setCurrentPartBeingFixed(Constants.CHASSIS);
                Thread.sleep(chassis.getFittingTime());
                car.fixChassis(chassis);
                currentStatus();

                setCurrentPartBeingFixed(Constants.FRAME);
                Thread.sleep(frame.getFitingTime());
                car.fixFrame(frame);
                currentStatus();

                setCurrentPartBeingFixed(Constants.ENGINE);
                Thread.sleep(engine.getFittingTime());
                car.fixEngine(engine);
                currentStatus();

                setCurrentPartBeingFixed(Constants.INTERIORS);
                Thread.sleep(interiors.getFittingTime());
                car.fixInteriors(interiors);
                currentStatus();

                setCurrentPartBeingFixed(Constants.COLORS);
                Thread.sleep(color.getColoringTime());
                car.applyColor(color);
                currentStatus();

                setCurrentPartBeingFixed(Constants.WHEEL);
                Thread.sleep(wheel.getFitingTime());
                car.fixWheels(wheel);
                currentStatus();

            } catch (InterruptedException e) {
                System.out.println("Process Failed!");
            }

            carCompletelyProduced = true;
        }

        setCurrentCarNumber(numberOfCarsToProduce + 1);
        System.out.println("PRODUCTION COMPLETE! ON ASSEMBLY LINE " + assemblyLineNum);
    }
}
