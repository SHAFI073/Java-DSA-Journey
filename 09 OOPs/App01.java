

public class App01 {
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
        // Student01 A = new Student01(1, 12, "Rahul", 3);
        // System.out.println(A.name);
        // System.out.println(A.age);
        // System.out.println(A.id);
        // System.out.println(A.no_of_subject);

        // A.study();
        // A.bunk();
        // A.sleep();

        //Copy ctor
        // Student01 B = new Student01(A); 
        // System.out.println(B.name);
        // System.out.println(B.age);
        // System.out.println(B.id);
        // System.out.println(B.no_of_subject);

        // B.study();
        // B.bunk();
        // B.sleep();

        /*ENCAPSULATION */
//         Student01 A = new Student01(1, 12, "Rahul", 3, "Tina");
//         System.out.println(A.name);--> it was public before
//         System.out.println(A.age);
//         System.out.println(A.id);
//         System.out.println(A.no_of_subject);
//         System.out.println(A.gf);
        // example to get name if it's private by using getters
        Student01 A = new Student01(1, 12, "Rahul", 3, "Tina");
        System.out.println(A.getName());
        System.out.println(A.getage()); //--> before setting the age
        //AFTER
        A.setage(67);
        System.out.println(A.getage());

        // A.study();
        // A.bunk();
        // A.sleep();
        
        

    }
}
