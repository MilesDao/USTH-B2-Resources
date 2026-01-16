import java.util.*;
public class Exercise19{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = n;
        int min = n/2;
        int randnum = (int)(Math.random() *(max - min) * min);
        System.out.println(randnum);
    }
}