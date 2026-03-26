import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        Set<String> bogieIds = new HashSet<>();

        System.out.println("--- Train Consist Management: UC3 ---");

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101");
        bogieIds.add("BG104");
        bogieIds.add("BG102");

        System.out.println("Attempted to add: BG101, BG102, BG103, BG101, BG104, BG102");

        System.out.println("\nFinal Unique Bogie IDs in System:");
        System.out.println(bogieIds);

        System.out.println("\nTotal Unique Bogies tracked: " + bogieIds.size());
    }
}