/*Write a Java program to check if a number is a palindrome in Java? (121 is a palindrome, 321 is not)
A nmber is called a palindrome if the number is equal to the reverse of a number e.g.,
121 is a palindrome because the reverse of 121 is 121 itself.On the other hand,
321 is not a palindrome because the reverse of 321 is 123, which is not equal to 321. */
import java.util.*;
public class FunctionsBasicsQ3_05 {
    public static boolean isPalindrome(int n){
        int Orignum = n;
        int reverse = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            reverse = (reverse * 10) + lastDigit;
            n = n / 10;
            
        }
        if( Orignum == reverse){
            return true;
        }else{
            return false;
        }
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("Is the number palindrome :");
        boolean result = isPalindrome(num);
        System.out.println(result);
        sc.close();
    }
}
