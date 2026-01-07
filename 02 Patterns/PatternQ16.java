import java.util.*;

public class PatternQ16 {
    public static void pattern15( int n){
        for( int i = 0; i < n; i++){
            char ch = (char) ('A' + i);
            for( int j  = 0; j <= i; j++){
                System.out.print(ch);
                
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern15(n);
        sc.close();
    }
}
