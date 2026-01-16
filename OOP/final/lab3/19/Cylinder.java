public class Cylinder extends Circle {
    protected double h;

    public Cylinder(double x, double y, double r, double h) {
        super(x, y, r);
        this.h = h;
    }

    @Override
    public double calArea() {
        return 2 * Math.PI * r * (h + r);
    }

    @Override
    public double calVolume() {
        return Math.PI * r * r * h;
    }

    @Override
    public String getName() {
        return "Cylinder";
    }
}
