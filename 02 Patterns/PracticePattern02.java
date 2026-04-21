import java.util.*;
public class PracticePattern02 {
    public static void trianglepattern( int num ){
        for( int line = 0; line <= num; line++){
            for( int star = 0; star <= line; star++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner( System.in );
        int num = sc.nextInt();
        trianglepattern(num);
        sc.close();
    }
}
