package Models;

import Interfaces.CarI;
import Models.Parts.Chassis;
import Models.Parts.Color;
import Models.Parts.Engine;
import Models.Parts.Frame;
import Models.Parts.Interiors;
import Models.Parts.Wheel;

public class Car implements CarI{
    private static final int PRICE_VAL = 4500000;
    private static final double MILEAGE = 21;
    private Chassis chassis;
    private Color color;
    private Engine engine;
    private Frame frame;
    private Interiors interiors;
    private Wheel wheel;

    public double getMileage() {
        return MILEAGE;
    }

    public int getPrice() {
        return PRICE_VAL;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Car Specifications\n"); 
        sb.append("1. " + chassis.getPartName() +  " " + chassis.getPartType());
        sb.append("2. " + frame.getPartName() +  " " + chassis.getPartType());
        sb.append("3. " + engine.getPartName() +  " " + chassis.getPartType());
        sb.append("4. " + interiors.getPartName() +  " " + chassis.getPartType());
        sb.append("5. " + "Interior Color: " + color.getInteriorColor() + " Frame Color: " + color.getFrameColor());

        sb.append("\n");
        return sb.toString();
    }

    public Chassis getChassis() {
        return chassis;
    }

    @Override
    public void fixChassis(Chassis chassis) {
        this.chassis = chassis;
    }

    public Color getColor() {
        return color;
    }
    
    @Override
    public void applyColor(Color color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }
    
    @Override
    public void fixEngine(Engine engine) {
        this.engine = engine;
    }

    public Frame getFrame() {
        return frame;
    }
    
    @Override
    public void fixFrame(Frame frame) {
        this.frame = frame;
    }

    public Interiors getInteriors() {
        return interiors;
    }
    
    @Override
    public void fixInteriors(Interiors interiors) {
        this.interiors = interiors;
    }
    
    public Wheel getWheel() {
        return wheel;
    }
    
    @Override
    public void fixWheels(Wheel wheel) {
        this.wheel = wheel;
    }
}