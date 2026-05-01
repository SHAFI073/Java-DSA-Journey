// ENCAPSULATION

public class Student01 {
    //Attributes
    public int id;
    private int age;
    private String name;
    public int no_of_subject;
    private String gf;

    /*default ctor
   public Student(){
       System.out.println("Student default ctor called");
    }*/
   // parameterized ctor
   public Student01(int id, int age, String name, int no_of_subject, String gf){
       System.out.println("Student Parameterized ctor called");
       this.id = id;
       this.age = age;
       this.name = name;
       this.no_of_subject = no_of_subject;
       this.gf = gf;
    }
    //example to get name if it's private as it's not directly being accessed
    public String getName(){
        return this.name;
    }
    public int getage(){
        return this.age;
    }
    public void setage(int a){
        this.age = a;
    }

    //methods // behaviour
    public void study(){
        System.out.println(name +" Studying");
    }
    public void sleep(){
        System.out.println(name +" Sleeping");
    }
    public void bunk(){
        System.out.println(name +" Bunking");
    }
    private void gfchatting(){
        System.out.println(name +" gf chatting");
    }
    // Copy ctor
    public Student01(Student01 scrobj){ // scrobj = cource object --> A
       System.out.println("Student COPY ctor called");
       this.id = scrobj.id;
       this.age = scrobj.age;
       this.name = scrobj.name;
       this.no_of_subject = scrobj.no_of_subject;
    }

    
}
