// to find the max value in array;

public class MaxArray04 {
    public static void main(String args[]){
        int arr[] = {56,-84,96,78,65,22};
        int MaxVal = arr[0];
        for( int i = 0; i < arr.length; i++){
            if( arr[i] > MaxVal){
                MaxVal = arr[i];
            }
        }
        System.out.print(MaxVal);
    }
}
