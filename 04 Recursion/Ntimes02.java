import java.util.*;
public class Ntimes02 {
    public static void print(int i ,int num,  String name){
        if( i == num) return;
        System.out.println(name);
        print(i + 1, num, name);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit :");
        int num = sc.nextInt();
        String name = "Shafi";
        print(0,num, name);
        sc.close();
    }
}
