import java.util.Scanner;

// Computer
class Computer {
    private int memory;
    private String processor;

    public Computer(int memory, String processor) {
        this.memory = memory;
        this.processor = processor;
    }

    // get memory and set memory
    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    // get and set processor
    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    // method
    public void turnOn() {
        System.out.println("Computer is turning on");
    }

    public void turnOff() {
        System.out.println("Computer is turning off");
    }

    public void display() {
        System.out.println("memory: " + memory);
        System.out.println("processor: " + processor);
    }
}
// Subclass laptop

class Laptop extends Computer {
    private String touchpad;

    public Laptop(int memory, String processor, String touchpad) {
        super(memory, processor);
        this.touchpad = touchpad;
    }

    // get and set touchpad
    public String getTouchpad() {
        return touchpad;
    }

    public void setTouchpad(String touchpad) {
        this.touchpad = touchpad;
    }

    // method
    public void openLid() {
        System.out.println("Laptop lid opened.");
    }

    @Override
    public void display() {
        System.out.println("Laptop information: ");
        super.display();
        System.out.println("touchpad : " + touchpad);
    }
}

class Deskop extends Computer {
    public Deskop(int mem, String processor) {
        super(mem, processor);
    }

    public void upgrade(String processor, int mem) {
        super.setMemory(mem);
        super.setProcessor(processor);
        System.out.println("Desktop upgraded successfully!");
    }

    @Override
    public void display() {
        System.out.println("\nDesktop Information:");
        super.display();
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // laptop
        System.out.println("laptop");
        System.out.println("processor: ");
        String lProcessor = sc.nextLine();
        System.out.println("memory: ");
        int lmem = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.println("Touchpad type: ");
        String touchpad = sc.nextLine();

        Laptop laptop = new Laptop(lmem, lProcessor, touchpad);

        // deskop
        System.out.println("deskop");
        System.out.println("processor: ");
        String dProcessor = sc.nextLine();
        System.out.println("memory: ");
        int dmem = sc.nextInt();
        sc.nextLine();
        Deskop deskop = new Deskop(dmem, dProcessor);

        // display information
        laptop.display();
        deskop.display();

        // open lib and upgrade
        laptop.openLid();
        // upgrade
        System.out.println("Upgrade deskop");
        System.out.println("New processor");
        String newProcessor = sc.nextLine();
        System.out.println("New memory");
        int newMemory = sc.nextInt();
        sc.nextLine();
        deskop.upgrade(newProcessor, newMemory);

        laptop.display();
        deskop.display();
    }
}