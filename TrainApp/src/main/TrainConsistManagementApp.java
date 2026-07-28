package main;

import java.util.Scanner;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Sorted array of bogie IDs
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

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        // Binary Search
        while (low <= high) {

            int mid = (low + high) / 2;

            int result = searchId.compareTo(bogieIds[mid]);

            if (result == 0) {
                System.out.println("Bogie ID " + searchId +
                        " found at position " + mid);
                found = true;
                break;
            } else if (result < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (!found) {
            System.out.println("Bogie ID " + searchId +
                    " does not exist in the train.");
        }

        System.out.println("Program completed successfully.");

        scanner.close();
    }
}