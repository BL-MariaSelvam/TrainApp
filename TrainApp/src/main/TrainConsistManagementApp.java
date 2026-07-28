package main;

// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {

    public CargoSafetyException(String message) {
        super(message);
    }
}

// Goods Bogie Class
class GoodsBogie {
    private String shape;
    private String cargo;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    // Assign cargo with safety validation
    public void assignCargo(String cargo) {

        try {
            // Business Rule:
            // Petroleum cannot be assigned to a Rectangular bogie
            if (shape.equalsIgnoreCase("Rectangular")
                    && cargo.equalsIgnoreCase("Petroleum")) {

                throw new CargoSafetyException(
                        "Unsafe Cargo Assignment! Petroleum cannot be assigned to a Rectangular bogie.");
            }

            this.cargo = cargo;
            System.out.println("Cargo assigned successfully.");
            System.out.println("Bogie Shape : " + shape);
            System.out.println("Cargo       : " + this.cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Cargo assignment process completed.");
        }
    }
}

// Main Class
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create a rectangular goods bogie
        GoodsBogie bogie = new GoodsBogie("Rectangular");

        // Attempt an unsafe cargo assignment
        bogie.assignCargo("Petroleum");

        // Program continues normally
        System.out.println("Application continues safely.");
    }
}