import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // 1. Create a HashMap to store bogie-capacity info
        HashMap<String, Integer> bogieCapacities = new HashMap<>();

        System.out.println("--- Train Consist Management: UC6 ---");

        // 2. Insert capacity values using put()
        bogieCapacities.put("Sleeper", 72);
        bogieCapacities.put("AC Chair", 56);
        bogieCapacities.put("First Class", 24);
        bogieCapacities.put("General", 90);

        // 3. Display the map using entrySet() iteration
        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacities.entrySet()) {
            System.out.println("Bogie Type: " + entry.getKey() + " | Seat Capacity: " + entry.getValue());
        }

        // 4. Demonstrate fast lookup
        String searchBogie = "AC Chair";
        if (bogieCapacities.containsKey(searchBogie)) {
            System.out.println("\nQuick Lookup: The " + searchBogie + " has " + bogieCapacities.get(searchBogie) + " seats.");
        }

        System.out.println("\nTotal Bogie Types Tracked: " + bogieCapacities.size());
    }
}