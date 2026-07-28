package main;

import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create a LinkedHashSet for the train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Attach bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add a duplicate bogie
        trainFormation.add("Sleeper");

        // Display the final train formation
        System.out.println("\nFinal Train Formation:");
        System.out.println(trainFormation);

        // Display total unique bogies
        System.out.println("\nTotal Unique Bogies: " + trainFormation.size());

        System.out.println("Program completed successfully.");
    }
}