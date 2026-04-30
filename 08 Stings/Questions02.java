// count length of String without using length()
public class Questions02 {
    public static int countLength( String str){
        char arr[] = str.toCharArray();
        int len = arr.length;
        return len;
        
    }
    public static void main(String[] args) {
        String name = "Babbar";
        System.out.print(countLength(name));
    }
}
