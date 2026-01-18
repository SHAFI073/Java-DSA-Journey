import java.util.*;
public class Back1toN05 {
    public static void print( int i, int num){
        if( i < 1) return ;
        print(i - 1, num);
        System.out.print(i+" ");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        print(num, num);
        sc.close();
    }
}
