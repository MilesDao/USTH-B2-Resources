public class Vector {
    private double x;
    private double y;

    // constructor
    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // getter
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Setter

    public void setX() {
        this.x = x;
    }

    public void setY() {
        this.y = y;
    }

    public Vector add(Vector v) {
        double newX = this.x + v.x;
        double newY = this.y + v.y;
        return new Vector(newX, newY);
    }

    public Vector subtract(Vector v) {
        double newX = this.x - v.x;
        double newY = this.y - v.y;
        return new Vector(newX, newY);
    }

    public Vector multiply(Vector v) {

        double newX = this.x * v.x;
        double newY = this.y * v.y;
        return new Vector(newX, newY);
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}