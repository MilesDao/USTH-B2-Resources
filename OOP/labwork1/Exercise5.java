public class Exercise5{
    public static void main(String[] args){
        int weight = 70;
        // boolean b = (60 <= weight <= 90); // can not
        // Correct one
        boolean b = (60 <=weight) && (weight<=90);
        System.out.println(b);
    }
}