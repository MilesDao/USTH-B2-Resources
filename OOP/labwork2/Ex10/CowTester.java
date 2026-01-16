package Ex10;

public class CowTester {
    public static void main(String[] args) {
        Cow c = new Cow();
        c.name = "Antony";
        c.age = 9;
        c.breed = "male";
        c.weight = 100;
        c.moo();
        System.out.println(c.name);
        System.out.println(c.age);
        System.out.println(c.breed);
        System.out.println(c.weight);

    }
}
