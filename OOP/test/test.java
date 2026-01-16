public class test {
    public static void main(String[] args){
        Animal a = new Animal();
        a.name = "Bruno";
        a.makeNoise();

        Cow c = new Cow();
        c.makeNoise();

        Dog d = new Dog();
        d.chaseCats();

    }
}
