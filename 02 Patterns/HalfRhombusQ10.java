import java.util.*;
public class HalfRhombusQ10 {
    public static void halfRhombus(int num){
        for( int i = 1; i <= 2*num-1; i++){
            int stars = i;
            if( i > num) stars = 2*num-i;
            for(int j = 1; j <= stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value : ");
        int num = sc.nextInt();
        halfRhombus(num);
    }
}
