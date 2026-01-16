public class LightBulb {
    private boolean isOn = false;
    private int brightness;

    // constructor
    public LightBulb(boolean isOn, int brightness) {
        this.isOn = false;
        this.brightness = 0;
    }

    public LightBulb() {
        this.brightness = 0;
        this.isOn = false;
    }

    public LightBulb(int brightness) {
        this.brightness = brightness;
        this.isOn = false;
    }

    public boolean getisOn() {
        return this.isOn;
    }

    public int getBrightness() {
        return this.brightness;
    }

    public void turnOn() {
        this.isOn = true;
        if (this.brightness == 0)
            this.brightness = 50;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public void increaseBrightness() {
        if (this.isOn && this.brightness < 100) {
            this.brightness += 10;
        }
    }

    public void getStatus() {
        if (this.isOn) {
            System.out.println("light is on with brightness: " + this.brightness);
        } else {
            System.out.println("light is off");
        }
    }
}