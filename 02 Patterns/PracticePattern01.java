import java.util.*;
public class PracticePattern01 {
    public static void SquarePattern( int num){
        for( int line = 0; line <= num; line++){
            for( int star = 0; star < num; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        SquarePattern(num);
        sc.close();
    }
}
