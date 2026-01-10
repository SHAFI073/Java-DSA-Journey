import java.util.*;
public class CountDigits01 {
    public static int count( int num ){
        int count = 0;
        while( num > 0){
            int lastDigit = num % 10;
            count += 1;
            num = num / 10;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digits to count them : ");
        int num = sc.nextInt();
        System.out.println("Total number of digits :"+count(num));

        sc.close();
    }
}
