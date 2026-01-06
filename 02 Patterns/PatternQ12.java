import java.util.*;
public class PatternQ12 {
    public static void Pattern(int num){

        int space = 2 * (num-1);
        for(int i = 1; i <= num; i++){
            //number
            for( int j = 1; j <= i; j++){
                System.out.print(j);
            }
            //space
            for(int j = 1; j <= space; j++){
                System.out.print(" ");
            }

            //number
            for( int j = i; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
        }
        
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Pattern(num);
        sc.close();
    }
    
}
