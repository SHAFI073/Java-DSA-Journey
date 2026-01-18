/*Printing N to 1 using backtracking */
import java.util.*;
public class BackNto106 {
    public static void Printing( int i , int num){
        if( i > num) return;
        Printing(i + 1, num);
        System.out.print(i+" ");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        Printing(1, num);
        sc.close();
    }
}
