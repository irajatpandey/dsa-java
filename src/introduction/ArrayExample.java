package introduction;

public class ArrayExample {
    public static void main(String[] args) {
       // declaration
       int a[]  = new int[5];
       for(int i = 0; i < a.length; i++){
           a[i] = i + 1;
       }
       for(int item : a){
           System.out.println(item);
       }
    }
}
