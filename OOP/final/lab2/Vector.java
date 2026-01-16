public class Vector {
    private double x;
    private double y;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // //getter
    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    // setter
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // function
    public Vector add(Vector v) {
        double newX = this.x + v.x;
        double newY = this.y + v.y;
        return new Vector(newX, newY);
    }

    public Vector substractor(Vector v) {
        double newX = this.x - v.x;
        double newY = this.y - v.y;
        return new Vector(newX, newY);
    }

    public Vector mul(Vector v) {
        double newX = this.x * v.x;
        double newY = this.y * v.y;
        return new Vector(newX, newY);
    }

    public String toString() {
        return "(" + x + "," + y + ")"; // ham de system out ra
    }

}
