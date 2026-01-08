import java.util.*;
public class PatternQ20 {
    public static void pattern20( int n ){
        //outerloop
        for( int i = 1; i <= 2*n-1; i++ ){
            int stars = i;
            if( i > n) stars = 2*n - i;
            int spaces = 2*(n - i);
            if( i > n) spaces = 2*(i - n); 
            //innerloop
            //stars
            for( int j = 1; j <= stars; j++){
                System.out.print("*");
            }
            //space
            for( int j = 1; j <= spaces; j++){
                System.out.print(" ");
            }
            //stars
            for( int j = 1; j <= stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern20(n);
        sc.close();
    }
}
