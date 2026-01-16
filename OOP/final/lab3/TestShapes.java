public class TestShapes {
    public static void main(String[] args) {
        Shape[] arr = new Shape[3];
        arr[0] = new Point(2, 3);
        arr[1] = new Circle(2, 3, 4);
        arr[2] = new Cylinder(2, 3, 4, 5);

        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i].getName());
            System.out.println("Area: " + arr[i].calArea());
            System.out.println("Volume: " + arr[i].calVolume());
        }

    }
}
