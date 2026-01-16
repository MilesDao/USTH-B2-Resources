import java.util.Arrays; // Imported for fun, but not strictly needed for this simple task
import java.lang.Math; // Math is in java.lang and is imported automatically

public class CarTester {
    public static void main(String[] args) {
        Car[] carFleet = new Car[5];

        carFleet[0] = new Car("Toyota", "Camry", 15000.00f, 400, 4);
        carFleet[1] = new Car("Ford", "Mustang", 22000.50f, 625, 4);
        carFleet[2] = new Car("Tesla", "Model S", 45000.75f, 900, 4);
        carFleet[3] = new Car("Bugatti", "Chiron", 1000000.00f, 1600, 4);
        carFleet[4] = new Car("Concept", "Monowheel", 8000.25f, 100, 1);

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println(carFleet[i].toString());
            System.out.println("Price: " + carFleet[i].price());
        }
    }
}