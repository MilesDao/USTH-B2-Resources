import java.util.*;
public class Exercise17{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        double a = myObj.nextDouble();
        double b = myObj.nextDouble();
        if(a == 0) {
            System.out.println("There is no solution");
        }
        else{
            double x = -b/a;
            System.out.println(x);
        }
        
    }
}