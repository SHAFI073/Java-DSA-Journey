import java.util.*;
public class PrimeNum14 {
    public static boolean isPrime( int num ){
        if( num <= 1) return false;
        for( int i = 2; i <= Math.sqrt(num); i++){
            if( num % i == 0){
                return false;
            }
            
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to know if it's prime or not : ");
        int number = sc.nextInt();
        boolean result = isPrime(number);
        System.out.print("Is the number "+number+" is Prime :"+result);
        sc.close();
    }
}
