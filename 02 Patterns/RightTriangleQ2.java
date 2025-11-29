import java.util.*;
public class RightTriangleQ2 {
    public static void rightAngle(int n){
        for(int i = 0; i < n; i++){
            for( int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int num = sc.nextInt();
        rightAngle(num);
        sc.close();
    }
}
