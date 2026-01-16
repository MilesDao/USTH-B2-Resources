public class Cow {
    private String name;
    private String breed;
    private int age;
    private double weight;

    // constructor

    public Cow(String name, String breed, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    // getter
    public String getName() {
        return this.name;
    }

    public String getBreed() {
        return this.breed;
    }

    public int getAge() {
        return this.age;
    }

    public double getWeight() {
        return this.weight;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    // function
    public void moo() {
        System.out.println("moooooooooo");
    }

    public void display() {
        System.out.println("name: " + this.name);
        System.out.println("breed: " + this.breed);
        System.out.println("age: " + this.age);
        System.out.println("weight: " + this.weight);
    }

}
