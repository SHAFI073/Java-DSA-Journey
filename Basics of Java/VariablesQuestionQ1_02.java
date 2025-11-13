/*In a program,input 3 numbers:A, B and C.You have to out put the average of 
these 3 numbers.
(Hint : Average of N numbers is sum of those numbers divided by N) */
import java.util.*;
public class VariablesQuestionQ1_02 {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        float average = (A + B + C) / 3;
        System.out.println("The average of the three numbers is :"+average);
        sc.close();
    }
    
}
