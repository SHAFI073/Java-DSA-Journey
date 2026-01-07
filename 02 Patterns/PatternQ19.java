import java.util.*;
public class PatternQ19 {
    public static void pattern19( int n ){
        //first half
        //outer loop
        for( int i = 0; i < n; i++){
            //inner loop
            //stars
            for( int j = 1; j <= n - i; j++){
                System.out.print("*");

            }
            //space
            for( int j = 1; j <= 2*i; j++){
                System.out.print(" ");
            }
            //stars
            for( int j = 1; j <= n - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second half
        //outer loop
        for( int i = 0; i < n; i++){
            //inner loop
            //stars
            for( int j = 1; j <= i + 1; j++){
                System.out.print("*");

            }
            //space
            for( int j = 1; j <= 2*( n - i - 1); j++){
                System.out.print(" ");
            }
            //stars
            for( int j = 1; j <= i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        pattern19(n);
        sc.close();
    }
}
