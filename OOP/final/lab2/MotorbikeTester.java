public class MotorbikeTester {
    public static void main(String[] args) {
        Motorbike mb = new Motorbike(69.23, 50, "yes");
        mb.display();
        mb.accelerate(10);
        mb.decelerate(30);
        mb.display();

    }
}
