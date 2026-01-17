public class Basic01 {
    public static void recur( int count){
        if( count >= 5) return;
        System.out.println(count);
        count++;
        recur(count);
    }
    public static void main(String args[]){
        recur(0);
    }
}
