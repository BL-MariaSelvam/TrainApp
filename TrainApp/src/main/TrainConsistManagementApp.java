package main;

import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create the train consist
        List<String> trainConsist = new ArrayList<>();

        System.out.println("Train consist initialized successfully.");

        // Add passenger bogies
        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        // Display bogies after insertion
        System.out.println("\nPassenger Bogies after adding:");
        System.out.println(trainConsist);

        // Remove one bogie
        trainConsist.remove("AC Chair");

        // Display bogies after removal
        System.out.println("\nPassenger Bogies after removing AC Chair:");
        System.out.println(trainConsist);

        // Check whether Sleeper exists
        if (trainConsist.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train.");
        } else {
            System.out.println("\nSleeper bogie does not exist in the train.");
        }

        // Display final list
        System.out.println("\nFinal Passenger Bogies:");
        System.out.println(trainConsist);

        System.out.println("\nCurrent Bogie Count : " + trainConsist.size());
        System.out.println("Program is ready for further operations.");
    }
}