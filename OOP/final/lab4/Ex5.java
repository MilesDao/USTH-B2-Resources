import java.util.Scanner;

class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        if (0 < mark && mark < 9)
            System.out.println("hello world");
        else {
            System.out.println("hehe");
        }
    }
}