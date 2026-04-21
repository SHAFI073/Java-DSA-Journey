import java.util.*;
public class Pattern {
    public static void pattern( int n){
        for( int line = 1; line <= n; line++){
            for( int star = line; star <= n; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        pattern(n);
        sc.close();

    }
}
