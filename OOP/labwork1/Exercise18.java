import java.util.*;
public class Exercise18 {
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        int s= 10;
        // int s = 0;
        // Input size
        // if (sc.hasNextInt()){
        //     s = sc.nextInt();
        // }


        double arr[] = new double[s];

        for(int i = 0 ; i<s; i++){
            arr[i] = sc.nextDouble();
            if(arr[i]<0 || arr[i]>1){
                return;
            }
        }
        
        double sum = 0.0 ;
        for( int i = 0 ; i < s ; i++){
            sum += arr[i];
        }
        Arrays.sort(arr);
        double mean = sum /10.0;
        double median = arr[4] + arr[5];
        System.out.println("mean = "+mean);
        System.out.println("median = "+ median);
    }
}
