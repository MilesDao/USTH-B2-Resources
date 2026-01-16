public class Main {
    public static void main(String[] args) {
        // inheritance = the process when one class acquires;
        //               the attributes and methods of another
        Car c = new Car();
        c.go();
        Bicycle b = new Bicycle();
        b.stop();
        System.out.println(c.Wheels);
        System.out.println(b.Pedals);
    }
}