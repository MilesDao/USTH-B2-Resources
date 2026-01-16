public class ShapeTester {
    public static void main(String[] args) {
        Shape[] arr = new Shape[3];
        arr[0] = new Point(3, 5);
        arr[1] = new Circle(3, 5, 7);
        arr[2] = new Cylinder(3, 5, 7, 9);
        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i].getName());
            System.out.println(arr[i].calArea());
            System.out.println(arr[i].calVolume());
        }
    }
}
