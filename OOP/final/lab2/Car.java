
public class Car {
    private String manufacturer;
    private String model;
    private float productionExpense;
    private int productionTime;
    private int wheelNumber;

    // costructor
    public Car(String ma, String mo, float pE, int pT, int wN) {
        this.manufacturer = ma;
        this.model = mo;
        this.productionExpense = pE;
        this.productionTime = pT;
        this.wheelNumber = wN;
    }
    // getter

    public float price() {
        float price = (float) (2 * this.productionExpense * Math.sqrt(this.productionTime));
        return price;
    }

    public String toString() {
        return "Manufacturer: " + manufacturer +
                ", Model: " + model +
                ", Expense: $" + String.format("%.2f", productionExpense) + // Format to 2 decimal places
                ", Time: " + productionTime + " units" +
                ", Wheels: " + wheelNumber;
    }
}
