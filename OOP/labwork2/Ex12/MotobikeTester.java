public class MotobikeTester {
    public static void main(String[] args) {
        Motobike mb = new Motobike(10.5, 50, "79A1-12345");
        System.out.println("Before acceleration:");
        mb.printStatus();

        mb.accelerate(20);
        System.out.println("\nAfter acceleration:");
        mb.printStatus();

        mb.decelerate(30);
        System.out.println("\nAfter deceleration:");
        mb.printStatus();
    }
}
