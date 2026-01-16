class Animal {
String name;
    void makeNoise() {
        System.out.println("Hmm");
    }
}
class Cow extends Animal {
    boolean givesMilk;
    void makeNoise() {
        System.out.println("Moooooooo...");
    }
}
class Dog extends Animal {
    void chaseCats() {
        System.out.println("I'm coming, cat!");
    }
}