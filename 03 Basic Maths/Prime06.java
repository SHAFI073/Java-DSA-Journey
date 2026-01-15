import java.util.*;
public class Prime06 {
    public static void isPrime(int num){
        if( num < 2) System.out.print(num+" not a prime number");
        int count = 0;
        for( int i = 1; i*i <= num; i++){
            if( num % i == 0){
                count++;
            }
            if( num/i != i){
                count++;
            }
        }
        if( count == 2) {
            System.out.print(num+" It is prime number");
        }else{
            System.out.print(num +" It is not a prime number");
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        isPrime(num);
        sc.close();
    }
}
