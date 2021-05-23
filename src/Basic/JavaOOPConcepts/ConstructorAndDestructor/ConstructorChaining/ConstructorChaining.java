package Basic.JavaOOPConcepts.ConstructorAndDestructor.ConstructorChaining;

public class ConstructorChaining
{
    public ConstructorChaining(){
        this(100); //
        System.out.println("Default Constructor");
    }

    public ConstructorChaining(int x)
    {
        this(100, 200);
        System.out.println(x);
    }
    public ConstructorChaining(int x, int y)
    {
        System.out.println(x*y);
    }
}
