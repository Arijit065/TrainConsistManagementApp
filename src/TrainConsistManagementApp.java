import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<String> trainConsist = new ArrayList<>();

        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        System.out.println("Train consist after adding bogies: " + trainConsist);

        trainConsist.remove("AC Chair");
        System.out.println("Removed 'AC Chair' from the consist.");

        boolean hasSleeper = trainConsist.contains("Sleeper");
        System.out.println("Does the train contain a Sleeper bogie? " + hasSleeper);

        System.out.println("Final train consist state: " + trainConsist);
    }
}