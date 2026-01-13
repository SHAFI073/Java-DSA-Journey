import java.util.*;
public class Armstrong04 {
    public static boolean isArmstrong( int num ){
        int count = String.valueOf(num).length();
        int Orignum = num;
        int sum = 0;
        if ( num < 0) return false;
        while( num != 0){
            int lastDigit = num % 10;
            sum = (int) (sum + Math.pow(lastDigit, count));
            num = num / 10;
        }
        return sum == Orignum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers : ");
        int num = sc.nextInt();
        if ( isArmstrong(num)){
            System.out.print(num+ " is Plaindrome");
        }else{
                System.out.print(num+" not Plaindrome");
            }
            sc.close();
        }
        
    }


