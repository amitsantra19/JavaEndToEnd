package Basic.Basics;

public class BasicsPrograming {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        introduceDataType();
        introduceConditionalStatement();

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


}