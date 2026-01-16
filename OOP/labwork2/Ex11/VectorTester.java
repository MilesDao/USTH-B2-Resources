public class VectorTester {
    public static void main(String[] args) {
        Vector v1 = new Vector(3.0, 4.0);
        Vector v2 = new Vector(5.6, 6.0);
        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v1 + v2 = " + v1.add(v2));
        System.out.println("v1 - v2 = " + v1.subtract(v2));
        System.out.println("v1 * v2 = " + v1.multiply(v2));

    }
}
