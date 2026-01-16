public class Circle extends Point {
    protected double r;

    public Circle(double x, double y, double r) {
        super(x, y);
        this.r = r;
    }

    @Override
    public double calArea() {
        return Math.PI * this.r * this.r;
    }

    @Override
    public double calVolume() {
        return 0;
    }

    @Override
    public String getName() {
        return "Circle";
    }
}
