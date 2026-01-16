public class CowTester {
    public static void main(String[] args) {
        Cow c = new Cow("trung", "male", 19, 58);
        c.display();
        c.moo();
        c.setName("ronaldo");
        c.display();
    }
}
