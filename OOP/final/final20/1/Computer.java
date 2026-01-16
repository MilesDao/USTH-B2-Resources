public class Computer {
    private int memory;
    private String processor;

    public Computer(int memory, String processor) {
        this.memory = memory;
        this.processor = processor;
    }

    // getter
    public int getMemory() {
        return memory;
    }

    public String getProcessor() {
        return processor;
    }

    // setter
    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    // method
    public void turnOn() {
        System.out.println("computer is turning on");
    }

    public void turnOff() {
        System.out.println("computer is turning off");
    }

    public void display() {
        System.out.println("Memory: " + memory);
        System.out.println("processor: " + processor);
    }
}
