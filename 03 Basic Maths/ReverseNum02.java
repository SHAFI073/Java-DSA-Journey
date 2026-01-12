import java.util.*;
public class ReverseNum02 {
    public static int revnumber( int num ){
        int revNum = 0;
        while( num > 0){
            int lastDigit = num % 10;
            num = num / 10;
            revNum = (revNum * 10) + lastDigit;
        }
        return revNum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers : ");
        int num = sc.nextInt();
        System.out.println("The reverse number is : "+revnumber(num));
        sc.close();
    }
}
