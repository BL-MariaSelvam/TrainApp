package main;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        Scanner scanner = new Scanner(System.in);

        // Read Train ID
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();

        // Read Cargo Code
        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        // Define regex patterns
        Pattern trainPattern = Pattern.compile("TRN-\\d{4}");
        Pattern cargoPattern = Pattern.compile("PET-[A-Z]{2}");

        // Create matchers
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // Validate Train ID
        if (trainMatcher.matches()) {
            System.out.println("Train ID is Valid.");
        } else {
            System.out.println("Train ID is Invalid.");
        }

        // Validate Cargo Code
        if (cargoMatcher.matches()) {
            System.out.println("Cargo Code is Valid.");
        } else {
            System.out.println("Cargo Code is Invalid.");
        }

        scanner.close();

        System.out.println("Program completed successfully.");
    }
}