import java.util.Scanner;
public class Exercise21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long sum = 0;
        int n = sc.nextInt();
        for(int i = 1; i< n+1; i++){
            sum += Math.pow(i,2);
        }
        System.out.println(sum);

    }
}
