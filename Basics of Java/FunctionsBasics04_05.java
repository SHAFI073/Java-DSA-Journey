import java.util.*;
public class FunctionsBasics04_05{
    public static int Factorial( int n){
        int f = 1;
        for( int i = 1; i <= n; i++){
            f = f * i;
        }
        return f;
    }
    public static int BinCoefficient(int n, int r){
        int factorial_n = Factorial(n);
        int factorial_r = Factorial(r);
        int factorial_nmr = Factorial(n-r); //m stahnd for minus(-)

        int binCoef = factorial_n / (factorial_r * factorial_nmr);
        return binCoef;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two values :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int fact = BinCoefficient(a, b);
        System.out.println("The Binomial Coefficient of "+a+" and "+b+" is "+fact);
        sc.close();
    }
}