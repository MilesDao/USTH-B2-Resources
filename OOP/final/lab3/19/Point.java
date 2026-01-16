public class Point extends Shape {
    protected double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double calArea() {
        return 0;
    }

    @Override
    public double calVolume() {
        return 0;
    }

    @Override
    public String getName() {
        return "Point";
    }
}
