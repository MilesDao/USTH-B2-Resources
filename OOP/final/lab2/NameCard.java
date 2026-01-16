class NameCard {

    private String name;
    private long phone;
    private String email;

    // constructor

    public NameCard(String name, long phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    // getter
    public String getName() {
        return this.name;
    }

    public long getPhone() {
        return this.phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void display() {
        System.out.println("name: " + this.name);
        System.out.println("phone number: " + this.phone);
        System.out.println("email: " + this.email);
    }
}