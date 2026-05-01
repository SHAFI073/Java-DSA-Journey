

public class Student {
    //Attributes
    public int id;
    public int age;
    public String name;
    public int no_of_subject;

    /*default ctor
   public Student(){
       System.out.println("Student default ctor called");
    }*/
   // parameterized ctor
   public Student(int id, int age, String name, int no_of_subject){
       System.out.println("Student Parameterized ctor called");
       this.id = id;
       this.age = age;
       this.name = name;
       this.no_of_subject = no_of_subject;
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
    // Copy ctor
    public Student(Student scrobj){ // scrobj = cource object --> A
       System.out.println("Student COPY ctor called");
       this.id = scrobj.id;
       this.age = scrobj.age;
       this.name = scrobj.name;
       this.no_of_subject = scrobj.no_of_subject;
    }

    
}
