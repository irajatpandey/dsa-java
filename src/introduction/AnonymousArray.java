package introduction;
//Java supports the feature of an anonymous array, so you don't need to declare the array while passing an array to the method.
public class AnonymousArray {

    public static void testAnonymousArray(int arr[]){
        for(int item : arr){
            System.out.print(item + " ");
        }
    }
    public static void main(String[] args) {
        testAnonymousArray(new int[]{1, 2, 3, 4, 5});
    }
}
