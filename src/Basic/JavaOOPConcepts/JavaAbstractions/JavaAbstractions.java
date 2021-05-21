package Basic.JavaOOPConcepts.JavaAbstractions;
/*
Abstraction is a process of hiding the implementation details and showing only functionality to the user.
 */
public class JavaAbstractions {

    public static void sendEmails()
    {
        System.out.println();
        System.out.println("Abstractions Example");
        connectToServer();
        authenticateUserCredential();
        disconnectedToSerer();
    }
    private  static void connectToServer(){
        System.out.println("Connected to emails server");
    }
    private static void authenticateUserCredential(){
        System.out.println("Authenticated");
    }
    private static void disconnectedToSerer(){
        System.out.println("Disconnected");
    }
}
