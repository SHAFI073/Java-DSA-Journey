public class Questions05 {
    public static boolean isPalindrome( String str){
        String Orignalword = str;
        String reverse = "";
        int n = str.length();
        for( int i = n-1; i >= 0; i--){
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }
        return Orignalword.equals(reverse);
    }
    public static void main(String[] args) {
        String word = "racecar";
        System.out.print("Is the Word "+word+" is Plaindrome? "+isPalindrome(word));
    }
}
