import java.util.*;
public class PracticePattern05 {
    public static void invertedpattern( int num){
        for( int row = 1; row <= num; row++){
            for( int star = 1; star <= num-row+1; star++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        invertedpattern(num);
        sc.close();
    }
}
