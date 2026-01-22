import java.util.*;
public class Fibonacci12 {
    public static int findNum( int n){
        if( n <= 1) return n;
        int last = findNum(n - 1);
        int slast = findNum(n - 2);
        return last + slast;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the position to know the number : ");
        int n = sc.nextInt();
        System.out.println("The number is : "+findNum(n));
        sc.close();
    }
}
