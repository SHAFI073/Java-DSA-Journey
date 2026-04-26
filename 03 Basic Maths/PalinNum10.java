import java.util.*;
public class PalinNum10 {
    public static boolean palinNum( int num ){
        int temp = num;
        int rev = 0;
        while(num > 0){
            int lastDigit = num % 10;
            rev = (rev * 10) + lastDigit;
            num = num / 10;
        }
        return temp == rev;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check if plaindrome or not : ");
        int num = sc.nextInt();
        boolean result = palinNum(num);
        System.out.print("The number "+num+" is palindrome : "+result);
        sc.close();
    }
}
