package main;

import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create an empty bogie collection
        List<String> bogies = new ArrayList<>();

        try {
            // Defensive check before searching
            if (bogies.isEmpty()) {
                throw new IllegalStateException(
                        "Search cannot be performed. Train consist is empty.");
            }

            // Search logic (only executes if the collection is not empty)
            String searchId = "BG101";

            if (bogies.contains(searchId)) {
                System.out.println("Bogie ID " + searchId + " found.");
            } else {
                System.out.println("Bogie ID " + searchId + " not found.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program completed successfully.");
    }
}