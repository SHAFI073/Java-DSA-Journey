import java.util.*;
public class RhombusQ9 {
    public static void UpperTriangle(int n){
        for( int i = 0; i < n; i++){
            //space
            for( int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            //star
            for( int j = 0; j < 2*i+1; j++){
                System.out.print("*");
            }
            //space
            for( int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void BelowTriangle( int n){
        for( int i = 0; i < n; i++){
            //space
            for( int j = 0; j < i; j++){
                System.out.print(" ");
            }
            //star
            for( int j = 0; j < 2*n - (2*i + 1); j++){
                System.out.print("*");
            }
            //space
            for( int j = 0; j < i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int num = sc.nextInt();
        UpperTriangle(num);
        BelowTriangle(num);
        sc.close();

    }
}
