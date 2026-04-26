import java.util.*;
public class Counter08 {
    public static int numbers( int num ){
        int counter = 0;
        do{
            counter = counter + 1;
            num = num / 10;
        }while( num > 0);
        return counter;

    }
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the value : ");
        int num =  sc.nextInt();
        int temp = num;
        int result = numbers(num);
        System.out.print("The total digits present in "+temp+" is "+result);
        sc.close();

    }
}
