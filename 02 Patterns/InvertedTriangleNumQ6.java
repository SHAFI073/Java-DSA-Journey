import java.util.*;
public class InvertedTriangleNumQ6 {
    public static void invertNumTri(int n){
        for( int i = 1; i <= n; i++){
            for( int j = 1; j <= n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int num = sc.nextInt();
        invertNumTri(num);
        sc.close();
    }
}
