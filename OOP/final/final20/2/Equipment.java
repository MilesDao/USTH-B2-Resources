public class Equipment {
    private String name;
    private String category;
    private double price;

    public Equipment(String name, String cate, double price) {
        this.name = name;
        this.category = cate;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String cate) {
        this.category = cate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // method
    @Override
    public String toString() {
        return name + "-" + category + "-" + price;
    }
}
