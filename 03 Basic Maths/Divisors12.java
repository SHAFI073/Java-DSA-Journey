import java.util.*;
public class Divisors12 {
    public static void divisor( int num ){
        for( int i = 1; i <= num; i++){
            if( num % i == 0){
                System.out.print(i+" , ");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to know all it's divisors : ");
        int number = sc.nextInt();
        divisor(number);
        sc.close();
    }
}
