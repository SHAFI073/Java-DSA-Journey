import java.util.*;
public class StringPalindrome11 {
    public static boolean isPalindrome(int i /*for index*/, String word){
        if( i >= word.length() / 2) return true;
        if( word.charAt(i) != word.charAt(word.length() - 1 - i)) return false;
        return isPalindrome(i + 1, word);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String word = sc.next();
        boolean result = isPalindrome(0, word);
        System.out.println("Is the word Plaindrome ? \n"+result);
        sc.close();
    }
}
