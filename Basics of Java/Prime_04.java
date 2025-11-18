import java.util.*;
public class Prime_04{
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a number to check :");
        int num = sc.nextInt();
        
        if( num <= 1){
            System.out.println("INVALID INPUT");
            return;
        }else if( num == 2){
            System.out.println("IT IS A PRIME NUMBER");
            return;
            
        }else{
        boolean isPrime = true;
        for( int i = 2; i <= Math.sqrt(num); i++){
            if( num % i == 0){
                isPrime = false;
                break;
            }
        }
        if( isPrime == true){
            System.out.println(num+" Number is PRIME");
        }else{
            System.out.println(num+" number is not prime");
        }
    }
    sc.close();
        
    }
}