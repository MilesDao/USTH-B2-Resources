import java.util.*;
public class Exercise25{
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        

        for( int i = 0 ; i < num.length; i++){
            num[i] = sc.nextInt();
        }
        int mostNum = num[0];
        int maxcount = 1;
        for(int i = 0; i<num.length ; i++){
            int count = 0;
            for(int j = i +1; j< num.length;j++){
                if(num[i]== num[j]){
                    count++;
                }
            }
            if(count >maxcount){
                maxcount = count;
                mostNum = num[i];
            }
        }
        System.out.println(maxcount);
        System.out.println(mostNum);
    }
}