import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Equipment[] equipments = new Equipment[n];

        for (int i = 0; i < n; i++) {
            System.out.println(i);
            System.out.print("name: ");
            String name = sc.nextLine();
            System.out.print("category: ");
            String category = sc.nextLine();
            System.out.print("price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            equipments[i] = new Equipment(name, category, price);
        }

        //
        String file = "output.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (Equipment e : equipments) {
                writer.write(e.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("error: " + e);
        }
    }
}