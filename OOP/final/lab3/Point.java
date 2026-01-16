public class Point extends Shape {
    protected double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    double calArea() {
        return 0.0;
    }

    @Override
    double calVolume() {
        return 0.0;
    }

    @Override
    String getName() {
        return "Point";
    }

    // own method
    void describe() {
        System.out.println("Porint at (" + this.x + "," + this.y + ")");
    }
}
