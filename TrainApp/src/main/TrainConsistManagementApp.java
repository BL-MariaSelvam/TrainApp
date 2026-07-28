package main;

// Custom Exception
class InvalidCapacityException extends Exception {

    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Passenger Bogie Class
class PassengerBogie {
    private String name;
    private int capacity;

    public PassengerBogie(String name, int capacity) throws InvalidCapacityException {

        if (capacity <= 0) {
            throw new InvalidCapacityException(
                    "Invalid Capacity! Capacity must be greater than zero.");
        }

        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bogie: " + name + ", Capacity: " + capacity;
    }
}

// Main Class
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        try {
            // Valid bogie
            PassengerBogie bogie1 = new PassengerBogie("Sleeper", 72);
            System.out.println("Created: " + bogie1);

            // Invalid bogie
            PassengerBogie bogie2 = new PassengerBogie("AC Chair", -20);
            System.out.println("Created: " + bogie2);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program completed successfully.");
    }
}