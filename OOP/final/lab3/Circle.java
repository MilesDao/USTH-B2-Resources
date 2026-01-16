public class Circle extends Point {
    protected double r;

    public Circle(double x, double y, double r) {
        super(x, y);
        this.r = r;
    }

    // cal area

    @Override
    double calArea() {
        return Math.PI * this.r * this.r;
    }

    @Override
    double calVolume() {
        return 0;
    }

    @Override
    String getName() {
        return "Circle";
    }

    public double getRadius() {
        return r;
    }

}