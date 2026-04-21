import java.util.Scanner;

public class PracticePattern06 {
    public static void numPattern( int num ){
        for( int row = 1; row <= num; row++){
            for( int number = 1; number <= num-row+1; number++){
                System.out.print(" "+number);
            }
            System.out.println();
        }
    }
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        numPattern(num);
        sc.close();
    }
}
