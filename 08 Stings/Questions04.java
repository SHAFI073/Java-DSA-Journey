// to reverse a string
public class Questions04 {
    public static String reverseString(String str){
        String reverse = "";
        int n = str.length();
        for( int  i = n-1; i >= 0; i--){
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }
        return reverse;
    }
    public static void main(String[] args) {
        String str = "EVERYTHING";
        System.out.print("The reverse of "+ str +" is : "+reverseString(str));

    }
}
