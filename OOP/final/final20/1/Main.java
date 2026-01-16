import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Laptop");
        System.out.print("memory: ");
        int lmem = sc.nextInt();
        sc.nextLine();
        System.out.print("processor: ");
        String lprocessor = sc.nextLine();
        System.out.print("touchpad: ");
        String touchpad = sc.nextLine();

        Laptop laptop = new Laptop(lmem, lprocessor, touchpad);

        System.out.println("Deskop");
        System.out.print("memory: ");
        int dmem = sc.nextInt();
        sc.nextLine();
        System.out.print("processor: ");
        String dprocessor = sc.nextLine();

        Deskop deskop = new Deskop(dmem, dprocessor);
        System.out.println("=================================================");
        laptop.display();
        deskop.display();
        System.out.println("=================================================");
        laptop.openLid();
        System.out.println("=================================================");
        System.out.println("upgrade memory");
        System.out.print("new memory: ");
        int newnem = sc.nextInt();
        sc.nextLine();
        System.out.print("new processor: ");
        String newprocessor = sc.nextLine();
        deskop.upgrade(newprocessor, newnem);
        System.out.println("=================================================");
        deskop.display();

    }
}