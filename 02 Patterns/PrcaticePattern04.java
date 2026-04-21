import java.util.*;
public class PrcaticePattern04 {
    public static void numpattern( int num ){
        for( int line = 1; line <= num; line++){
            for( int number = 1; number <= line; number++){
                System.out.print(" "+line);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        numpattern(num);
        sc.close();

    }
}
