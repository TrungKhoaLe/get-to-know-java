public class LearnLambdaExpression {
    public static void main(String[] args) {
        // lambda expression = feature for Java 8 and above
        // also know as anonymous method
        // a shorted way to write anonymous classes with only one method
        //
        // need to use a functional interface or use a pre-defined functional interface
        // which are interfaces that contain only one abstract method
        // e.g. ActionListener, Runnable, (user-defined)
        //
        // A lambda express can be used in any place where a functional interface would normally be required
        // Syntax: (arguments) -> {statement/s}
        LearnLambdaExpressionMyInterface myInterface = () -> System.out.println("Hello, world!");
        myInterface.message();

        LearnLambdaExpressionMyInterface myInterface1 = () -> {
            System.out.println("We need to go out.");
            System.out.println("It is a nice day.");
        };
        myInterface1.message();

        String name = "KL";
        char symbol = '!';
        LearnLambdaExpressionMySecondInterface myInterface3 = (myName, mySymbol) -> System.out.println("Hello, " + myName + mySymbol);
        myInterface3.message(name, symbol);
    }
}
