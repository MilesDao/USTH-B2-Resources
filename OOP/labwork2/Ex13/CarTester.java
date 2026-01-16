// CarTester.java
public class CarTester {
    public static void main(String[] args) {
        Car[] cars = new Car[5];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
            cars[i].setManufacturer("Brand" + (i + 1));
            cars[i].setModel("Model" + (i + 1));
            cars[i].setProductionExpense(20000 + i * 5000);
            cars[i].setProductionTime(10 + i * 2);
            cars[i].setWheelNumber(4);
            cars[i].printInfo();
            System.out.println("------------------------------");

        }

    }
}
