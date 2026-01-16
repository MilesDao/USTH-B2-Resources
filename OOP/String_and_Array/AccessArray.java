public class AccessArray {
    public static void main(String[] args){
        String arr[][] = {{"OOP","Ip"},{"DL", "IS", "WEB"}};
        for(int i =0; i< arr.length; i++){
            for( int j=  0; j < arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        
    }
}
