import java.util.*;
public class FrequOfElements02 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int arrSize = sc.nextInt();
        System.out.println("Enter the Elements :");
        //input of Elements in the array
        int arrElements[] = new int[arrSize];
        for( int i = 0; i < arrSize; i++){
            arrElements[i] = sc.nextInt();
        }
        //pre computation
        int hash[] = new int[13];
        for( int i = 0; i < arrSize; i++){
            hash[arrElements[i]] +=1;
        }

        System.out.print("Enter the size of the Query :");
        int query = sc.nextInt();
        while( query-- != 0){
            int number = sc.nextInt();
            System.out.println("Frequency :"+hash[number]);
            //fetching
        }
        sc.close();
    }
}
