/* Display all numbers entered by user except or skip multiple of 10 */
import java.util.*;
public class ContinueQ1_04 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter your number (enter 0 to exit): ");
            int num = sc.nextInt();
            if( num == 0){
                break;
            }
            if( num % 10 == 0){
                continue;
            } 
            System.out.println("Your number was :"+num);
        }while(true);
        sc.close();
        System.out.println("STOPED");
         
        
        
    }
}
