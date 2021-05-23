package Basic.JavaOOPConcepts.ConstructorAndDestructor;

public class ConstructorAndDestructor {
    private int rollno;
    private  int totalMarks;
    private String name;

    public ConstructorAndDestructor(){
        rollno = 0;
        totalMarks =0;
        name = null;
    }
    public  ConstructorAndDestructor(int marks){
        totalMarks = marks;

    }
    public ConstructorAndDestructor(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }
    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Roll Number : "+rollno);
        System.out.println("Total Marks : "+totalMarks);
    }
}
