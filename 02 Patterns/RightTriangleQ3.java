import java.util.*;
public class RightTriangleQ3 {
    public static void NumTriangle(int n){
        for( int i = 1; i <= n; i++){
            for( int j = 1; j <= i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int num = sc.nextInt();
        NumTriangle(num);
        sc.close();
    }
}
