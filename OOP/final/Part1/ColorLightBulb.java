public class ColorLightBulb extends LightBulb {
    private String color;

    // Constructor

    public ColorLightBulb() {
        super();
        this.color = "white";

    }

    public ColorLightBulb(String color) {
        super();
        this.color = color;
    }

    // getter
    public String getColor() {
        return this.color;
    }

    // setter
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void getStatus() {
        if (getIsOn()) {
            System.out.println("The light is on");
            System.out.println("Brightness = " + getBrightness() + "/100");
            System.out.println("color : " + this.color);
        } else {
            System.out.println("the light is off");
        }
    }

}
