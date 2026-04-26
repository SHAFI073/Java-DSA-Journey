import java.util.*;
public class Reversing09 {
    public static int reverse(int num ){
        int revNum = 0;
        do{
            int lastDigit = num % 10;
            revNum = (revNum * 10) + lastDigit;
            num = num / 10;
        }while(num != 0);
        return revNum;
    }
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int temp = num;
        int result = reverse(num);
        System.out.print("The reverse of "+temp+" is "+result);
        sc.close();
    }
}
