import java.util.*;
public class RightTriangleQ11 {
    public static void rightTriangle(int num){
        int start = 1;
        for(int i = 0; i < num; i++){
            if( i % 2 == 0) start = 1;
            else start = 0;
            for( int j = 0; j <= i; j++){
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        rightTriangle(num);
        sc.close();

    }
}
