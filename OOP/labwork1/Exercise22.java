import java.util.Scanner;
import java.util.HashMap;
public class Exercise22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b[] = new int[32];
        int num = sc.nextInt();
        int i = 0;
        
        while(num!= 0){
            b[i] = num%2;
            num = num /2;
            i++;
        }
        for( int j = i -1; j >=0; j--){
            System.out.println(b[j]);
        }
        sc.close();
    }
    
}
