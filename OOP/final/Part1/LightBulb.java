public class LightBulb extends Device {
    private int brightness;

    // constructor
    public LightBulb() {
        super();
        this.brightness = 0;
    }

    // getter

    public int getBrightness() {
        return this.brightness;
    }

    // function
    @Override
    public void turnOn() {
        super.turnOn(); // Call the parent's turnOn() to set isOn = true
        this.brightness = 20;
    }

    @Override
    public void turnOff() {
        super.turnOff();
        this.brightness = 0;
    }

    public void increaseBrightness() {
        if (this.isOn && this.brightness <= 100) {
            this.brightness += 20;
        }
    }

    public void getStatus() {
        if (this.isOn) {
            System.out.println("The light is on");
            System.out.println("Brightness = " + this.brightness + "/100");
        } else {
            System.out.println("the light is off");
        }
    }
}