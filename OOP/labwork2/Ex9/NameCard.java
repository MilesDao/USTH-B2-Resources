public class NameCard {

    private int phone;
    private String name;
    private String email;

    // Constructor
    public NameCard(String name, int phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    // getter
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhone() {
        return phone;
    }

    // Setter
    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method
    public void print() {

        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("=================================");
    }
}
