import java.util.LinkedList;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        LinkedList<String> trainConsist = new LinkedList<>();

        System.out.println("--- Train Consist Management: UC4 ---");

        // Adding bogies to the consist
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Formation: " + trainConsist);

        // Inserting a Pantry Car at position 2 (index 2)
        System.out.println("\nInserting 'Pantry Car' at position 2...");
        trainConsist.add(2, "Pantry Car");
        System.out.println("Current Formation: " + trainConsist);

        // Removing the first and last bogie
        System.out.println("\nDetaching the first and last bogies...");
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // Display the final ordered train consist
        System.out.println("\nFinal Ordered Train Consist:");
        System.out.println(trainConsist);

        System.out.println("\nTotal Bogies remaining: " + trainConsist.size());
    }
}