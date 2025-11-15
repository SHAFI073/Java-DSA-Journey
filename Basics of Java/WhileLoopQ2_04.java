/*Sum of first n natural numbers */
import java.util.*;
public class WhileLoopQ2_04 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();
        int n = 1;
        int sum = 0;
        while( n <= num ){
            sum += n;
            n++;
        }
        System.out.println("The sum of first n naturals numbers is :"+sum);
        sc.close();
    }
}
