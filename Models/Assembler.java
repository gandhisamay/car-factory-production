package Models;
import java.util.*;
import Constants.Constants;

public class Assembler {

    public void runFactory(){
        Scanner in = new Scanner(System.in);
        // Inputs for the factory
        System.out.println("Car Factory Simulation!");
        System.out.print("Enter the number of assembly lines in factory :");
        int n = in.nextInt();

        HashMap<String, Integer> availableParts = Constants.getAvailableParts();
        var availablePartsSet = availableParts.entrySet();

        List<HashMap<String,Integer>> partInfo = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            HashMap<String, Integer> partsByLine = new HashMap<>();
            var it = availablePartsSet.iterator();
            System.out.println("For Assembly Line " + i);

            while(it.hasNext()){

                Map.Entry<String, Integer> part = (Map.Entry<String, Integer>)it.next();

                final String partType = part.getKey();
                final int partOptions = part.getValue();

                System.out.println("Enter type of " + partType + " (1-" + partOptions + ")");
                int chosenPart = in.nextInt();

                //Check if the part value entered is valid
                while(chosenPart > partOptions || chosenPart < 1){
                    System.out.println("Invalid part number! Choose Again");
                    chosenPart = in.nextInt();
                }

                //Store the part value entered in a hashmap
                partsByLine.put(part.getKey(), chosenPart);

            }

            partInfo.add(partsByLine);

        }

        System.out.println(partInfo);
        in.close();
    }
}
