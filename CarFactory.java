import java.util.HashMap;

import Models.AssemblyLine;

public class CarFactory {
    public static void main(String[] args) {
        AssemblyLine asm = new AssemblyLine();
        HashMap<String, Integer> partsByLine = new HashMap<>();
        partsByLine.put("Frame", 1);
        partsByLine.put("Chassis", 2);
        partsByLine.put("Colors", 3);
        asm.setCurrentPartBeingFixed("Frame");
        System.out.println(asm.currentStatus());
    }
}
