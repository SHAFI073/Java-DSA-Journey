// to find the minimum value in an array

public class MinArray05 {
    public static void main(String args[]){
        int arr[] = {10,20,30,40,5,89,2,7};
        int MinValue = arr[0];
        for( int i = 0; i < arr.length; i++){
            if( arr[i] < MinValue){
                MinValue = arr[i];
            }
        }
        System.out.print(MinValue);
    }
}
