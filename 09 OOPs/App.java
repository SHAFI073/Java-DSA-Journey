

public class App {
    public static void main(String[] args) throws Exception {
        // default ctor
        //Student A = new Student();
        // A.id = 1;
        // A.age = 14;
        // A.name = "Gandu";
        // A.no_of_subject = 5;
        // System.out.println(A.name);
        // System.out.println(A.age);
        // System.out.println(A.id);
        // System.out.println(A.no_of_subject);

        // A.study();
        // A.bunk();
        // A.sleep();

        /*Parametereised ctor */
        Student A = new Student(1, 12, "Rahul", 3);
        // System.out.println(A.name);
        // System.out.println(A.age);
        // System.out.println(A.id);
        // System.out.println(A.no_of_subject);

        // A.study();
        // A.bunk();
        // A.sleep();

        //Copy ctor
        Student B = new Student(A); 
        System.out.println(B.name);
        System.out.println(B.age);
        System.out.println(B.id);
        System.out.println(B.no_of_subject);

        B.study();
        B.bunk();
        B.sleep();

    }
}
