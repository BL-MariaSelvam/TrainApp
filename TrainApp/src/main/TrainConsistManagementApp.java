package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " - Capacity: " + capacity;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create a collection of bogies
        List<Bogie> bogies = new ArrayList<>();

        // Add sample data
        for (int i = 1; i <= 10000; i++) {
            bogies.add(new Bogie("Bogie" + i, (i % 100) + 1));
        }

        // ---------------- Loop-Based Filtering ----------------
        long loopStart = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie bogie : bogies) {
            if (bogie.getCapacity() > 60) {
                loopResult.add(bogie);
            }
        }

        long loopEnd = System.nanoTime();
        long loopTime = loopEnd - loopStart;

        // ---------------- Stream-Based Filtering ----------------
        long streamStart = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        long streamEnd = System.nanoTime();
        long streamTime = streamEnd - streamStart;

        // Display results
        System.out.println("\nLoop Filtered Bogies : " + loopResult.size());
        System.out.println("Loop Execution Time  : " + loopTime + " ns");

        System.out.println("\nStream Filtered Bogies : " + streamResult.size());
        System.out.println("Stream Execution Time  : " + streamTime + " ns");

        System.out.println("\nProgram completed successfully.");
    }
}