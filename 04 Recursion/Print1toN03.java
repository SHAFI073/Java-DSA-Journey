import java.util.*;
public class Print1toN03 {
    public static void printNum( int i, int num){
        if ( i > num) return;
        System.out.print(i+" ");
        printNum(i + 1, num);
    }
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        printNum(0, num);
        sc.close();
    }
}
