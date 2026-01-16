// using continue statement with for loop

public class Continue {
    public static void main(String[] args){
        for(int i = 0; i< 11; i++){
            if (i == 5){
                System.out.println("Continue at i = "+ i);
                continue;
            }
            System.out.println("For loop time: "+ i);
        }
        
    }
}
