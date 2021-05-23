package Basic.JavaOOPConcepts.ConstructorAndDestructor.CopyConstructor;

public class ComplexNumber {
    private double re, im;
    // A normal parameterized constructor
    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }
    // copy constructor
    public ComplexNumber(ComplexNumber c) {
        System.out.println("Copy constructor called");
        re = c.re;
        im = c.im;
    }
    // Overriding the toString of Object class
    @Override
    public String toString() {
        return "(" + re + " + " + im + "i)";
    }
}
