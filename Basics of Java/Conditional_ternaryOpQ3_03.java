/* Check if a student pass or fail */
import java.util.*;
public class Conditional_ternaryOpQ3_03 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String result = ( marks >= 33) ? "PASS" : "FAIL";
        System.out.println(result);
        sc.close();
        
    }
}
