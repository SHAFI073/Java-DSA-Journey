import java.util.*;

public class PatternQ22 {
    public static void pattern22( int n){
        for( int i = 0; i < 2*n-1; i++){
            for( int j = 0; j < 2*n-1; j++){
                int top = i;
                int left = j;
                int right = (2*n - 2) - j;
                int bottom = (2*n - 2) - i;
                int minDist = Math.min(Math.min(top,bottom), Math.min(left,right));
                System.out.print( n - minDist);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern22(n);
        sc.close();
    }
}
