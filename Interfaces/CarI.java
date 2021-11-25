package Interfaces;

import Interfaces.CarI;
import Models.Parts.Chassis;
import Models.Parts.Color;
import Models.Parts.Engine;
import Models.Parts.Frame;
import Models.Parts.Interiors;
import Models.Parts.Wheel;

public interface CarI {
    double getMileage();
    int getPrice();
    void fixChassis(Chassis chassis);
    void applyColor(Color color);
    void fixEngine(Engine engine);
    void fixFrame(Frame frame);
    void fixInteriors(Interiors interiors);
    void fixWheels(Wheel wheel);
}
