import java.util.*;
public class ArmStrong11 {
    public static boolean Counter( int num ){
        int OriginalValue = num;
        int temp = num;
        int sum = 0;

        int count = 0;
        while(num > 0){
            count = count + 1;
            num = num / 10;
        }
        while(temp > 0){
            int lastDigit = temp % 10;
            sum = sum + ((int)Math.pow(lastDigit, count));
            temp = temp / 10;
        }
        return OriginalValue == sum;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's Armstrong or not : ");
        int num = sc.nextInt();
        boolean result = Counter(num);
        System.out.print("Is the number "+num+" is Armstrong : "+result);
        sc.close();
    }
}
