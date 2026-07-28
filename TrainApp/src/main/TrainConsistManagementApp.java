package main;

import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create a HashSet for unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Add bogie IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // Duplicate
        bogieIds.add("BG102"); // Duplicate

        // Display the unique bogie IDs
        System.out.println("\nUnique Bogie IDs:");
        System.out.println(bogieIds);

        // Display total unique bogie count
        System.out.println("\nTotal Unique Bogie Count: " + bogieIds.size());

        System.out.println("Program completed successfully.");
    }
}