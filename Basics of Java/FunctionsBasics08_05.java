import java.util.*;
public class FunctionsBasics08_05 {
    public static int DectoBin( int n){
        int BinNum = 0;
        int pow = 0;
        while( n > 0){
            int remainder = n % 2; //By using modulo operator we'll get the remainder
            BinNum = BinNum + (remainder * (int)Math.pow(10, pow));
            pow++;
            n = n / 2; // this will get us the quotient 
        }
        return BinNum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary input toget the decimal value : ");
        int n = sc.nextInt();
        int result = DectoBin(n);
        System.out.println("Binary of "+n+" is = "+result);
        sc.close();
    }
}
