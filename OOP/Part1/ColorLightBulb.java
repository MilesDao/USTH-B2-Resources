public class ColorLightBulb extends LightBulb {
    private String color;

    // Constructor
    public ColorLightBulb() {
        super();
        this.color = "while";
    }

    public ColorLightBulb(int brightness, String color) {
        super(brightness);
        this.color = color;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    @Override
    public void getStatus() {
        if (this.getisOn()) {
            System.out.println("light is on with brightness: " + getBrightness() + "color " + this.color);
        } else {
            System.out.println("light is off");
        }
    }
}
