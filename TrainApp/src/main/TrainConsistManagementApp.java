package main;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Array of passenger bogie capacities
        int[] capacities = {72, 56, 24, 90, 48};

        // Display original capacities
        System.out.println("\nPassenger Bogie Capacities (Before Sorting):");
        for (int capacity : capacities) {
            System.out.print(capacity + " ");
        }

        // Bubble Sort
        for (int i = 0; i < capacities.length - 1; i++) {
            for (int j = 0; j < capacities.length - i - 1; j++) {

                // Swap if the left element is greater than the right element
                if (capacities[j] > capacities[j + 1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // Display sorted capacities
        System.out.println("\n\nPassenger Bogie Capacities (After Bubble Sort):");
        for (int capacity : capacities) {
            System.out.print(capacity + " ");
        }

        System.out.println("\n\nProgram completed successfully.");
    }
}