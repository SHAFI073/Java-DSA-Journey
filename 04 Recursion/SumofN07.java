/*Parameterised Recursion */
import java.util.*;
public class SumofN07 {
    public static void firstNnum( int i, int sum){
        if( i < 1) {
            System.out.print("The sum is : "+sum);
            return;
        }
        firstNnum(i - 1, sum + i);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int num = sc.nextInt();
        firstNnum(num, 0);
        sc.close();
    }
}
