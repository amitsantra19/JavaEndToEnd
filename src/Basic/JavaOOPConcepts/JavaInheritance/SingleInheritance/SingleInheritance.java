package Basic.JavaOOPConcepts.JavaInheritance.SingleInheritance;

class SingleDeriveClass {
    public void display(){
        System.out.println("Display public base class function");
    }
    private void show(){
        System.out.println("Show private Base class function");
    }
}

public class SingleInheritance extends SingleDeriveClass{
    public void displayDrive(){
        System.out.println("Display Drive Class Function");
    }
}
