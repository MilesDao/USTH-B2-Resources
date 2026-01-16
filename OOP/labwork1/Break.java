// Using break statement with while loop
public class Break {
    public static void main(String[] args){
        int i = 0;
        while(i < 11){
            if(i == 5){
                System.out.println("Break at i = "+ i);
                break;
            }

            System.out.println("While loop time: " + i);
            i++;
        }
    }
}
