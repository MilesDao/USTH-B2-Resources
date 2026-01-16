import java.util.*;
public class EncodeString {
    public static void main(String[] args){
        String str = "Hello";
        System.out.println("Str: " + str);
        byte[] b = str.getBytes();
        System.out.println(Arrays.toString(b));
        int[] c = {100, 12, 123 , 1233};
        System.out.println(Arrays.toString(c));
        
    }
}
