import java.util.*;

public class PalindromeNum03 {
    public static boolean checkNum( int num ){
        int OrigNum = num;
        int reverse = 0;
        if(num < 0) return false;
        while( num != 0){
            int lastDigit = num % 10;
            reverse = (reverse * 10 ) + lastDigit;
            num = num / 10;
        }
        
        return OrigNum == reverse;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers : ");
        int num = sc.nextInt();
        if(checkNum(num)){
            System.out.print(num+" Numbers are palindrome ");
        }else{
            System.out.print(num+" Numbers are not plaindrome");
        }
        checkNum(num);
        sc.close();
    }
}
