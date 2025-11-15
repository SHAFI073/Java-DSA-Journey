/*Write a Java program that takes a year from the user and print whether that 
year is a leap year or not. */
import java.util.*;
public class Conditional_leapYearQ5_03 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year to know if it's leap year or not :");
        int year = sc.nextInt();

        if( year % 4 == 0){
            if( year % 100 == 0){
                if( year % 400 == 0){
                    System.out.println("It's a leap year ");
                }else{
                    System.err.println("not a leap year");
                }
            }else{
                System.out.println("Year "+year+" is a leap year");
            }
        }else{
            System.out.println("Not a leap year ");
        }
        sc.close();
    }
}
