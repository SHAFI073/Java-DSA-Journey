/*Income tax calculator */
import java.util.*;
public class Conditional_else_ifQ2_03 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income : ");
        int income = sc.nextInt();
        int tax;

        if( income < 500000 ){
            tax = 0;
        }
        else if( income >= 500000 && income < 1000000 ){
            System.out.println("20% tax");
            tax = (int) ( income * 0.2);
        }
        else{
            System.out.println("30% tax");
            tax = (int) (income * 0.3);
        }
        System.out.print("your tax is :"+tax);
        sc.close();
    }
}
