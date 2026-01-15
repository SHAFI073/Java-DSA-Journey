import java.util.*;

public class GCD07 {
    public static int findGcd( int a, int b){
        while( a > 0 && b > 0){
            if( a>b){
                a = a % b;
            }else{
                b = b % a;
            }
        }
        if( a == 0) return b;
        else return a;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number: ");
        int num1 = sc.nextInt();
        int num2  = sc.nextInt();
        System.out.print("The GCD of "+num1+" and "+num2+" is :"+findGcd(num1, num2));
        sc.close();
    }
}
