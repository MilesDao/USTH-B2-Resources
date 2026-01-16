public class Duck {
    private int size;

    public void setSize(int s) {
        if (s > 0)
            size = s;
    }

    public static void main(String[] args) {

        Duck d = new Duck();
        d.setSize(5);
        System.out.println("Size of duck is " + d.size);
    }
}
