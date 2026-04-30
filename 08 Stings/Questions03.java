// to count Vowels in a String
public class Questions03 {
    public static  int countVowels( String str){
        int count = 0;
        for( int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
                count ++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String sentence = "The purple kangaroo sang opera while balancing a toaster on its tail, but the toaster only understood binary";
        System.out.print(countVowels(sentence));
    }
}
