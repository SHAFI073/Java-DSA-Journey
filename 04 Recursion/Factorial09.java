import java.util.*;
public class Factorial09 {
    public static void fact( int i, int mul){
        if( i < 1){
            System.out.print("The factorial is: "+mul);
            return;
        }
        fact(i - 1, mul * i);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        fact(num, 1);
        sc.close();
    }
}
