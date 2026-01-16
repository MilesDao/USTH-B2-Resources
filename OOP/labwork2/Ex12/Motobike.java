public class Motobike {
    private double fuel;
    private double speed;
    private String license;

    // Constructor
    public Motobike(double fuel, double speed, String license) {
        this.fuel = fuel;
        this.speed = speed;
        this.license = license;
    }

    // Getter
    public double fuel() {
        return fuel;
    }

    public double speed() {
        return speed;
    }

    public String license() {
        return license;
    }

    // Setter
    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    // method
    public void accelerate(double d) {
        speed += d;
    }

    public void decelerate(double d) {
        speed -= d;
        if (speed < 0)
            speed = 0;
    }

    public void printStatus() {
        System.out.println("License: " + license);
        System.out.println("Fuel: " + fuel + " L");
        System.out.println("Speed: " + speed + " km/h");
    }
}
