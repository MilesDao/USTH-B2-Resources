public class Motorbike {
    private double fuel;
    private double speed;
    private String license;

    public Motorbike(double f, double s, String l) {
        this.fuel = f;
        this.speed = s;
        this.license = l;
    }

    // gettter
    public double getFuel() {
        return this.fuel;
    }

    public double getSpeed() {
        return this.speed;
    }

    public String getLicense() {
        return this.license;
    }
    // function

    public void accelerate(double d) {
        this.speed += d;
    }

    public void decelerate(double d) {
        this.speed -= d;
    }

    //
    public void display() {
        System.out.println("information");
        System.out.println("Fuel = " + this.fuel);
        System.out.println("Speed = " + this.speed);
        System.out.println("License = " + this.license);
    }
}
