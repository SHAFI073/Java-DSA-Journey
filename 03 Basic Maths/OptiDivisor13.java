import java.util.*;
public class OptiDivisor13 {
    public static void optimized( int num ){
        for( int i = 1; i <= Math.sqrt(num); i++){
            if( num % i == 0){
                System.out.print(i+",");
                if( i != num / i){
                System.out.print((num/i)+",");
            }
            }
            
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to it's divisors : ");
        int number = sc.nextInt();
        optimized(number);
        sc.close();
    }
}
