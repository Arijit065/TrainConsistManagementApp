import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        Set<String> trainFormation = new LinkedHashSet<>();

        System.out.println("--- Train Consist Management: UC5 ---");

        // Attach bogies in a specific physical sequence
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        System.out.println("Current Formation: " + trainFormation);

        // Attempt to attach a duplicate bogie
        System.out.println("\nAttempting to attach a duplicate 'Sleeper' bogie...");
        boolean isAdded = trainFormation.add("Sleeper");

        if (!isAdded) {
            System.out.println("System Alert: Duplicate bogie detected! Attachment rejected.");
        }

        // Display final formation
        System.out.println("\nFinal Train Formation (Order Maintained):");
        System.out.println(trainFormation);

        System.out.println("\nTotal unique bogies in sequence: " + trainFormation.size());
    }
}