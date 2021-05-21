package Basic.Basics;

import Basic.JavaOOPConcepts.JavaAbstractions.JavaAbstractions;
import Basic.JavaOOPConcepts.JavaEncapsulation.JavaEncapsulation;
import Basic.JavaOOPConcepts.JavaInheritance.MultilevelInheritance.MultilevelInheritance;
import Basic.JavaOOPConcepts.JavaInheritance.SingleInheritance.SingleInheritance;

public class BasicsPrograming {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        introduceDataType();
        introduceConditionalStatement();
        introduceBasicLoopInJava();
        /* ******************JAVA OOPs Concept****************************/
        JavaAbstractions.sendEmails();
        int deposit = JavaEncapsulation.depositMoney(1000);
        System.out.println(deposit);
        int withdraw = JavaEncapsulation.wthDrawMoney(500);
        System.out.println(withdraw);
        //Single Inheritance
        System.out.println("Single Inheritance Example");
        SingleInheritance si = new SingleInheritance();
        si.display(); // calling base class public method using drive class object
        si.displayDrive();
        //si.show(); compilation error due to not accessible

        //Multi Level inheritance
        System.out.println("Multilevel Inheritance Example");
        MultilevelInheritance mi = new MultilevelInheritance();
        mi.display();
        mi.show();
        mi.multilevelShow();
    }

    public static void introduceDataType()
    {
        // Primitive Type: Different Data Type and print them in Console
        int x = 5;
        printDataType("int : " , x);
        String s = "amit";
        printDataType("String : " , s);
        double d = 1563313113d;
        printDataType("double : " , d);
        boolean b = true;
        printDataType("boolean : " , b);
        long l = 1465465464;
        printDataType("long : " , l);
        char c = 'Z';
        printDataType("char : " , c);
        float f = 14.3f;
        printDataType("float : " , f);
    }

    // use generic to simplify the function
    public static<T> void printDataType( String s, T x){
        System.out.println(s+x);
    }

    public static  void introduceConditionalStatement()
    {
        int x = 5;
        long l = 5;
        System.out.println("if-else Example");
        if(x == l){
            System.out.println("True");
        }else{
            System.out.println("false");
        }
        System.out.println("if-else-if ladder");
        int temp = 15;
        if(temp > 15)
            System.out.println("its greater than 15");
        else if(temp <15)
            System.out.println("its less than 15");
        else if(temp == 15)
            System.out.println("its equal to 15");
        else
            System.out.println("Nothing");

        int i = 2;
        switch (i){
            case 0:
                System.out.println("Case 0 executed : I is "+i);
                break;
            case 1:
                System.out.println("Case 1 executed : I is "+i);
                break;
            case 2:
                System.out.println("Case 2 executed : I is "+i);
                break;
            case 3:
                System.out.println("Case 3 executed : I is "+i);
                break;
            default:
                System.out.println("Default Executed");
        }
    }

    public static  void introduceBasicLoopInJava(){
        String loop = "while";
        int i = 0;
        switch(loop){
            case "for":
                System.out.println("For loop Executed");
                for(i = 0;i<4;i++)
                {
                    System.out.print(i);
                }
                break;
            case "while":
                System.out.println("While loop Executed");
                while (i<4){
                    System.out.print(i);
                    i++;
                }
                break;
            case "do-while" :
                System.out.println("Do While loop Executed");
                do{
                    System.out.print(i);
                    i++;
                }while(i<4);
                break;
            default:
                System.out.println("No loop Executed");
        }
    }
}
