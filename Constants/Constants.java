package Constants;
import java.util.HashMap;

import Models.Parts.Chassis;
import Models.Parts.Colors;
import Models.Parts.Engine;
import Models.Parts.Frame;
import Models.Parts.Interiors;
import Models.Parts.Wheel;

public final class Constants {
    public static final String FRAME = "Frame"; 
    public static final String WHEEL = "Wheel"; 
    public static final String ENGINE= "Engine"; 
    public static final String INTERIORS = "Interiors"; 
    public static final String CHASSIS = "Chassis";
    public static final String COLORS = "Colors";
    
    public static final int FRAME_OPTIONS = 5;
    public static final int WHEEL_OPTIONS = 3;
    public static final int ENGINE_OPTIONS = 8;
    public static final int INTERIORS_OPTIONS = 3;
    public static final int CHASSIS_OPTIONS = 7;
    public static final int COLORS_OPTIONS = 12;

    public static HashMap<String, Integer> getAvailableParts(){
       HashMap<String, Integer> partsAvailable = new HashMap<>();
       partsAvailable.put(FRAME, FRAME_OPTIONS);
       partsAvailable.put(WHEEL, WHEEL_OPTIONS);
       partsAvailable.put(ENGINE,ENGINE_OPTIONS);
       partsAvailable.put(INTERIORS, INTERIORS_OPTIONS);
       partsAvailable.put(CHASSIS, CHASSIS_OPTIONS);
       partsAvailable.put(COLORS, COLORS_OPTIONS);
       
       return partsAvailable;
    }

    public static HashMap<String, Integer> getPartsWithTime(){
        HashMap<String, Integer> partsWithTime = new HashMap<>();
        partsWithTime.put(FRAME, Frame.FITTING_TIME);
        partsWithTime.put(WHEEL, Wheel.FITTING_TIME);
        partsWithTime.put(ENGINE,Engine.FITTING_TIME);
        partsWithTime.put(INTERIORS, Interiors.FITTING_TIME);
        partsWithTime.put(CHASSIS, Chassis.FITTING_TIME);
        partsWithTime.put(COLORS, Colors.COLORING_TIME);
        
        return partsWithTime;
     }
}
