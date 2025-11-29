import java.util.*;
public class RightTriangleNumQ3 {
    public static void NumberTriangle(int n){
        for( int i = 1; i <= n; i++){
            for( int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value :");
        int num = sc.nextInt();
        NumberTriangle(num);
        sc.close();
    }
}
