public abstract class Device {
    public boolean isOn;

    public Device() {
        this.isOn = false;
    }

    public boolean getIsOn() {
        return this.isOn;
    }

    public void turnOn() {
        this.isOn = true;

    }

    public void turnOff() {
        this.isOn = false;
    }

    public abstract void getStatus();
}
