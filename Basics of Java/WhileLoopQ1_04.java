/* Print numbers from 1 to n*/
import java.util.*;
public class WhileLoopQ1_04 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();
        int n = 1;
        while( n <= num ){
            System.out.println(n);
            n++;
        }
        sc.close();

    }
}
