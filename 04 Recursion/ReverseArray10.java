import java.util.*;
public class ReverseArray10 {
    public static void rev( int i, int array[],int n ){
        int point1 = 0;
        int point2 = array.length - 1;

        while( point1 < point2){
            int temp = array[point1];
            array[point1] = array[point2];
            array[point2] = temp;

            point1++;

            point2--;
        }

        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();
        int array[] = new int[size];
        for( int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }
        rev(0, array, size);
        for( int i = 0; i < size; i++){
            System.out.print(array[i]+" ");
        }
        sc.close();
    }
}
