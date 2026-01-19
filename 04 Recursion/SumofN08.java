/*Functional Recursion  */
import java.util.*;
public class SumofN08 {
    public static int print( int i){
        if( i == 0) return 0;
        return i + print(i - 1);

    }
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the value : ");
        int num = sc.nextInt();
        System.out.print("The sum is : "+print(num));
        sc.close();

    }
}
