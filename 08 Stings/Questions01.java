// Print each character of the String
public class Questions01 {
    public static void printString(String str){
        int n = str.length();
        for( int i = 0; i < n; i++){
            char ch = str.charAt(i);
            System.out.print(ch);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        String name  = "Babbar";
        printString(name);

        
    }
}
