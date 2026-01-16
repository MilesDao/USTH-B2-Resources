public class Car {
    private String manufacturer;
    private String model;
    private float productionExpense;
    private int productionTime;
    private int wheelNumber;

    // Constructor

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setProductionExpense(float productionExpense) {
        this.productionExpense = productionExpense;
    }

    public void setProductionTime(int productionTime) {
        this.productionTime = productionTime;
    }

    public void setWheelNumber(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    public float price() {
        return (float) (2 * productionExpense * Math.sqrt(productionTime));
    }

    public void printInfo() {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Wheels: " + wheelNumber);
        System.out.println("Production Expense: " + productionExpense);
        System.out.println("Production Time: " + productionTime);
        System.out.println("Selling Price: " + price());
    }
}