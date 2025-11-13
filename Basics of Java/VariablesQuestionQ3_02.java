/*Enter cost of 3 items from the user (using float data type)-a pencil, a pen and an eraser. 
You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) */
import java.util.*;
public class VariablesQuestionQ3_02 {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the cost of pencil :");
        float pencil = sc.nextFloat();
        System.out.print("Enter the cost of pen :");
        float pen = sc.nextFloat();
        System.out.print("Enter the cost of eraser :");
        float eraser = sc.nextFloat();
        float beforeGST = pencil + pen + eraser;
        System.out.println("Before GST :"+beforeGST);
        float afterGST = beforeGST + (0.18f * beforeGST);
        System.out.println("The total bill including 18% GST is Rs :"+afterGST);
        sc.close();
    }
    
}
