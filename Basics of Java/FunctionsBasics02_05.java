import java.util.*;
public class FunctionsBasics02_05 {
    public static int CalculateSum( int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = CalculateSum(a, b);
        System.out.println("Sum of "+a+" and "+b+" is ="+sum);
        sc.close();

    }
}
