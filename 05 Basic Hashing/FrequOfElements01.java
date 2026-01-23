import java.util.*;
public class FrequOfElements01 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Input of the array
        System.out.print("Enter the size of the array : ");
        int arrSize = sc.nextInt();
        System.out.println("Enter the elements : ");
        int arrElements[] = new int[arrSize]; 
        for( int i = 0; i < arrSize; i++){
            arrElements[i] = sc.nextInt();
        }

        //precompute
        int hash[] = new int[13];
        for( int i = 0; i < arrSize; i++){
            hash[arrElements[i]] += 1;
        }

        System.out.print("How many queries : ");
        int Q = sc.nextInt();
        while( Q-- != 0 ){ 
            System.out.print("Enter Number : ");
            int number = sc.nextInt();
                System.out.println("Frequency :"+hash[number]);
        }
        sc.close();
    }
}
