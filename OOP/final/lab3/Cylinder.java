public class Cylinder extends Circle {
    protected double h;

    public Cylinder(double x, double y, double r, double h) {
        super(x, y, r);
        this.h = h;
    }

    @Override
    double calArea() {
        return 2 * Math.PI * r * (h + r);
    }

    @Override
    double calVolume() {
        return Math.PI * this.r * this.r * this.h;
    }

    @Override
    String getName() {
        return "Cylinder";
    }
}
