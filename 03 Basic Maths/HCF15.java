import java.util.*;
public class HCF15 {
    public static int GCD( int n1, int n2){
        while( n1 > 0 && n2 > 0){
            if(n1 > n2){
                n1 = n1 % n2;
            }else {
                n2 = n2 % n1;
            }

        }
        if( n1 == 0 ) return n2;
        else return n1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number to find Greatest Common Factor : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.print("The GCD of "+num1+" and "+num2+" is "+GCD(num1, num2));
        sc.close();
    }
    
}
