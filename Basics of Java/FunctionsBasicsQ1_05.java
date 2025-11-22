/*Write a Java method to compute the average of three numbers. */
import java.util.*;
public class FunctionsBasicsQ1_05 {
    public static float Average(float a, float b, float c){
        float sum = a + b + c;
        float avg = sum / 3;
        return avg;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers to know their average :");
        float num1 = sc.nextInt();
        float num2 = sc.nextInt();
        float num3 = sc.nextInt();

        float result = Average(num1, num2, num3);
        System.out.print("Average of "+num1+","+num2+" & "+num3+" is = "+result);
        sc.close();

    }
}
