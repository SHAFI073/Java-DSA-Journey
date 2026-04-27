

public class SumArray02 {
    public static void main(String args[]){
        int arr[] = {10,20,30,40,50};
        int n = arr.length; //to find th length of an array;
        int sum = 0;
        for( int i = 0; i <= n-1; i++){
            sum = sum + arr[i];
        }
        System.out.print(sum);
    }
}
