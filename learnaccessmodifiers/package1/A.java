package package1;
import package2.*;

public class A {
    protected   String protectedMessage = "This is protected.";
    public static void main(String[] args) {
        //
        /* Attempt to access the defaultMessage in the C class of the package2.
         * I received a error message saying that defaultMessage is not public 
         * in C and cannot be accessed from outside package. If I try to access
         * the defaultMessage variable using from the Asub class, the it will
         * work just fine. */
        // C c = new C();
        // System.out.println(c.defaultMessage);
        
        // Attempt to access the publicMessage variable
        // C c = new C();
        // System.out.println(c.publicMessage);
        
        B b = new B();
        System.out.println(b.privateMessage);
    }
}
