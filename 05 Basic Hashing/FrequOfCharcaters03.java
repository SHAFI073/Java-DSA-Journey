import java.util.*;
public class FrequOfCharcaters03 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Characters : ");
        String cha = sc.next();

        //precompute
        int hash[] = new int[26];
        for( int i = 0; i < cha.length(); i++){
            hash[cha.charAt(i) - 'a']++;
        }

        System.out.print("Enter the query :");
        int query = sc.nextInt();
        while( query-- != 0){
            System.out.print("Enter the Charcater : ");
            char ch = sc.next().charAt(0);
            System.out.println("Frequency : "+hash[ch - 'a']);


        }
        sc.close();
    }
}
