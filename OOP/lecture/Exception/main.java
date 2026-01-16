public class main {
    public static void main(String[] args) {

        try {
            int myInt = Integer.parseInt("1");
            System.out.println("Hello skibidi");
        } catch (NumberFormatException nfe) {
            System.out.println("you can not do that shit");
        } finally {
            System.out.println("Finally block");
        }
        System.out.println("End here");

        // try {
        // int myInt = Integer.parseInt("1");
        // } catch (NumberFormatException nfe) {
        // System.out.println("you can not do that shit");
        // }

    }
}