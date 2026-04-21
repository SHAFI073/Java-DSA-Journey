import java.util.*;
public class PracticePattern08 {
    public static void invertedtriangle( int num ){
        //lines
        for( int i = 0; i < num; i++){
            //space
            for( int j = 0; j < i; j++){
                System.out.print(" ");
            }
            //star
            for( int j = 0; j < 2*num-(2*i + 1); j++){
                System.out.print("*");
            }
            //space
            for( int j = 0; j < i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        invertedtriangle(num);
        sc.close();

    }
}
