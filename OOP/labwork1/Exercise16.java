import java.util.*;
public class Exercise16{
    public static void main( String[ ] args){
        Scanner myObj = new Scanner(System.in);

        int a = myObj.nextInt();
        int b = myObj.nextInt();
        int c = myObj.nextInt();

        boolean res = !( a == b && b  == c);
        System.out.print(res);
    }
}