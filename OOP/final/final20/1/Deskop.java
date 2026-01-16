public class Deskop extends Computer {

    public Deskop(int mem, String processor) {
        super(mem, processor);
    }

    public void upgrade(String processor, int mem) {
        super.setProcessor(processor);
        super.setMemory(mem);
    }

    @Override
    public void display() {
        System.out.println("laptop information:");
        super.display();
    }
}
