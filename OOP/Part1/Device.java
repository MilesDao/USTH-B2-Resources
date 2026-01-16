public abstract class Device {
    private boolean isOn;

    public Device() {
        this.isOn = false;
    }

    public boolean getisOn() {
        return this.isOn;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public abstract String getStatus();
}
