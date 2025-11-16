/*printing a square pattern */
import java.util.*;
public class ForLoopQ1_04 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for( int lines = 1; lines <= n; lines++){
            for( int stars = 1; stars <= n; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
