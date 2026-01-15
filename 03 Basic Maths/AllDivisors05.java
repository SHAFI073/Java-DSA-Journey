import java.util.*;
public class AllDivisors05 {
    public static void findDiv( int num){
        for( int i = 1; i <= Math.sqrt(num); i++){
            if( num % i == 0){
                System.out.print(i+" "+num/i+" ");
            }
          
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to know it's divisors : ");
        int num = sc.nextInt();
        findDiv(num);
        sc.close();
    }
}
