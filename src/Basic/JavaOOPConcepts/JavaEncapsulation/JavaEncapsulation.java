package Basic.JavaOOPConcepts.JavaEncapsulation;
/*Encapsulation is defined as the wrapping up of data under a single unit.
It is the mechanism that binds together code and the data it manipulates
*/

public class JavaEncapsulation {
    private static int currentBalance = 10000;
    public static int depositMoney(int money){
        currentBalance = currentBalance+money;
        return  currentBalance;
    }
    public static int wthDrawMoney(int money){
        currentBalance=currentBalance-money;
        return  currentBalance;
    }
}
