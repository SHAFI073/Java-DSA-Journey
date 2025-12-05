import java.util.*;
public class InvertedStarTriQ5 {
    public static void invertStar( int n){
        for( int i = 1; i <= n; i++){
            for( int j = 0; j < n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int num = sc.nextInt();
        invertStar(num);
        sc.close();

    }
}
