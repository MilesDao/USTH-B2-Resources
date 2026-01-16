public class LightBulbTester {
    public static void main(String[] args) {
        LightBulb light = new LightBulb();
        light.turnOn();
        light.getStatus();

        light.turnOff();
        light.increaseBrightness();
        light.getStatus();

        light.turnOn();
        light.increaseBrightness();
        light.getStatus();

        light.turnOff();
        light.getStatus();

        ColorLightBulb lc = new ColorLightBulb();
        lc.turnOn();
        lc.increaseBrightness();
        lc.setColor("yellow");
        lc.getStatus();

    }
}
