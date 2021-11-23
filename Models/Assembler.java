package Models;
import java.util.*;
import Constants.Constants;

public class Assembler{

    public void runFactory(){
        Scanner in = new Scanner(System.in);
        // Inputs for the factory
        System.out.println("Car Factory Simulation!");
        System.out.print("Enter the number of assembly lines in factory :");
        int n = in.nextInt();

        List<HashMap<String,Integer>> partInfo = new ArrayList<>();
        List<Integer> numOfCarsPerAssLine = new ArrayList<>(); 

        for (int i = 1; i <= n; i++) {

            HashMap<String, Integer> partsByLine = new HashMap<>();
            Iterator<Map.Entry<String,Integer>> it = Constants.getIterator(Constants.getAvailableParts());
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

            System.out.println("Number of cars to produce on Assembly Line " + i);
            int numOfCars = in.nextInt();

            numOfCarsPerAssLine.add(numOfCars);


            partInfo.add(partsByLine);

        }

        for (int i = 1; i <= partInfo.size(); i++) {
            
            new AssemblyLine(partInfo.get(i-1),numOfCarsPerAssLine.get(i-1) , i).start();
            
        }

        in.close();
    }
}
