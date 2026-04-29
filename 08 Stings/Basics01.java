

public class Basics01 {
    public static void main(String[] args) {
        String first_name = "Babbar";
        String last_name = new String ("Rana");

        System.out.println(first_name+" "+last_name);
        //to find the length of the string 
        System.out.println("The number of characters in first_name: "+first_name.length());
        //to find the a particular charracter in a particular index
        System.out.println("In first_name at index 3 : "+first_name.charAt(3));
        System.out.println("In first_name at index 5 : "+first_name.charAt(5));
        System.out.println("In last_name at index 3 : "+last_name.charAt(3));
    }
}
