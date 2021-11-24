package Constants;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class Constants {
   public static final String FRAME = "Frame";
   public static final String WHEEL = "Wheel";
   public static final String ENGINE = "Engine";
   public static final String INTERIORS = "Interiors";
   public static final String CHASSIS = "Chassis";
   public static final String COLORS = "Colors";
   public static final String TECHNICO_INDUSTRIES = "Technico Industries";
   public static final String RED = "Red";
   public static final String GREEN = "Green";
   public static final String YELLOW = "Yellow";
   public static final String BLACK = "Black";

   public static final int FRAME_OPTIONS = 5;
   public static final int WHEEL_OPTIONS = 3;
   public static final int ENGINE_OPTIONS = 8;
   public static final int INTERIORS_OPTIONS = 3;
   public static final int CHASSIS_OPTIONS = 7;
   public static final int COLORS_OPTIONS = 12;


   public static HashMap<String, Integer> getAvailableParts() {
      HashMap<String, Integer> partsAvailable = new HashMap<>();
      partsAvailable.put(FRAME, FRAME_OPTIONS);
      partsAvailable.put(WHEEL, WHEEL_OPTIONS);
      partsAvailable.put(ENGINE, ENGINE_OPTIONS);
      partsAvailable.put(INTERIORS, INTERIORS_OPTIONS);
      partsAvailable.put(CHASSIS, CHASSIS_OPTIONS);
      partsAvailable.put(COLORS, COLORS_OPTIONS);

      return partsAvailable;
   }

   public static Iterator<Map.Entry<String,Integer>> getIterator(HashMap<String, Integer> map){
      
      var mapEntrySet = map.entrySet();
      return mapEntrySet.iterator();
   }

}
