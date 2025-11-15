/*Making a calculator using switch statement */
import java.util.*;
public class Conditional_switchQ4_03 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("select the appropriate '+'-'/'*'%' ");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+' : System.out.println(num1+num2);
                break;
            case '-' : System.out.println(num1-num2);
                break;
            case '*' : System.out.println(num1*num2);
                break;
            case '/' : System.out.println(num1/num2);
                break;
            case '%' : System.out.println(num1%num2);
                break;
            default : System.out.println("INVALID");        
        }
        sc.close();
    }

}
