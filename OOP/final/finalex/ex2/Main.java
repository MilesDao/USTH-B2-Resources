import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        sc.nextLine();

        Equipment[] equipments = new Equipment[n];

        for (int i = 0; i < n; i++) {
            System.out.println(i);
            System.out.println("name: ");
            String name = sc.nextLine();

            System.out.println("categorry: ");
            String category = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            equipments[i] = new Equipment(name, category, price);
        }

        String filename = "equipment.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Equipment e : equipments) {
                writer.write(e.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }
        sc.close();
    }
}
