public class Demo {
    public static void main(String[] args) {
        Animal[] arr = new Animal[3];
        arr[0] = new Animal();
        arr[1] = new Dog();
        arr[2] = new Cat();
        for (int i = 0; i < 3; i++) {
            arr[i].sound();
        }
    }
}
