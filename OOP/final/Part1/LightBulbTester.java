public class LightBulbTester {
    public static void main(String[] args) {
        // LightBulb lb = new LightBulb();
        // lb.getStatus();
        // lb.turnOn();
        // lb.increaseBrightness();
        // lb.increaseBrightness();
        // lb.getStatus();

        ColorLightBulb lb2 = new ColorLightBulb("yellow");
        lb2.turnOn();
        lb2.getStatus();
        lb2.setColor("Pink");
        lb2.increaseBrightness();
        lb2.increaseBrightness();
        lb2.getStatus();
        lb2.turnOff();
        lb2.getStatus();
    }
}
