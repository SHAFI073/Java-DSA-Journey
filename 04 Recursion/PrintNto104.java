
import java.util.*;
public class PrintNto104 {
    public static void printN( int i, int num){
        if( i < 1 ) return;
        System.out.print(i+" ");
        printN(i - 1, num);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        printN(num, num);
        sc.close();
        
    }
}
