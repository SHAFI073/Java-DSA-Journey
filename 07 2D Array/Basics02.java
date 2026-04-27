import java.util.*;

public class Basics02 {
    public static void main(String args[]){
        int arr[][] = new int[3][4];
        Scanner sc = new Scanner(System.in);
        //INPUT
        for( int i = 0; i < arr.length; i++){
            for( int j = 0; j < arr[i].length; j++){
                System.out.println("Provide value for row= "+i+" and col= "+j);
                arr[i][j] = sc.nextInt();
            }
        }
        //OUTPUT
        for( int i = 0; i < arr.length; i++){
            for( int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
