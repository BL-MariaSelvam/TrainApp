package main;

import java.util.Scanner;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Array of bogie IDs
        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG310",
                "BG415",
                "BG520"
        };

        // Accept bogie ID to search
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Bogie ID to search: ");
        String searchId = scanner.nextLine();

        boolean found = false;

        // Linear Search
        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                found = true;
                break;
            }
        }

        // Display result
        if (found) {
            System.out.println("Bogie ID " + searchId + " exists in the train.");
        } else {
            System.out.println("Bogie ID " + searchId + " does not exist in the train.");
        }

        System.out.println("Program completed successfully.");

        scanner.close();
    }
}