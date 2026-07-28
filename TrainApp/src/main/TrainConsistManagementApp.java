package main;

import java.util.LinkedList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create a LinkedList for the train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(trainConsist);

        // Insert Pantry Car at position 2 (index 2)
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nAfter inserting Pantry Car:");
        System.out.println(trainConsist);

        // Remove the first and last bogie
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // Display the final ordered train consist
        System.out.println("\nFinal Ordered Train Consist:");
        System.out.println(trainConsist);

        // Display total bogie count
        System.out.println("\nCurrent Bogie Count: " + trainConsist.size());

        System.out.println("Program completed successfully.");
    }
}