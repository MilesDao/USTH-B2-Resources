public class Laptop extends Computer {
    private String touchpad;

    public Laptop(int memory, String processor, String touchpad) {
        super(memory, processor);
        this.touchpad = touchpad;
    }

    public String getTouchpad() {
        return touchpad;
    }

    public void setTouchpad(String touchpad) {
        this.touchpad = touchpad;
    }

    //
    public void openLid() {
        System.out.println("Laptop lid is openned");
    }

    @Override
    public void display() {
        System.out.println("laptop information:");
        super.display();
        System.out.println("touchpad: " + touchpad);
    }
}
