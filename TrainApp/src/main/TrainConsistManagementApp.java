package main;

import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Array of bogie type names
        String[] bogieNames = {
                "Sleeper",
                "Cargo",
                "Engine",
                "First Class",
                "AC Chair"
        };

        // Display original array
        System.out.println("\nBefore Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // Sort alphabetically
        Arrays.sort(bogieNames);

        // Display sorted array
        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println("\nProgram completed successfully.");
    }
}