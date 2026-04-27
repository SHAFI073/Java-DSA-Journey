// find the total value of array by multiplacation

public class MulArray03 {
    public static void main(String args[]){
        int arr[] = {10,20,30,40,50,6,7};
        int n = arr.length;
        int multiply = 1;
        for( int i = 0; i <= n-1; i++){
            multiply = multiply * arr[i];
        }
        System.out.print(multiply);
    }
}
