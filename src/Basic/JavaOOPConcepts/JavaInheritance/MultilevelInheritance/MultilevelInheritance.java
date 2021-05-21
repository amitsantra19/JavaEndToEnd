package Basic.JavaOOPConcepts.JavaInheritance.MultilevelInheritance;

class BaseClass{
    public void display(){
        System.out.println("Base Class public method");
    }
}

class DeriveClass extends BaseClass{
    public void show(){
        System.out.println("Derive 1 Class public method");
    }
}

public class MultilevelInheritance extends DeriveClass{
    public void multilevelShow(){
        System.out.println("Final Derive Class public method");
    }
}
