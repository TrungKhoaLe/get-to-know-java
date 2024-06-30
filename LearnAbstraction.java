public class LearnAbstraction {
    public static void main(String[] args) {
        // abstract = abstract classes cannot be instantiated, but they can have a subclass
        // abstract methods are declared without an implementation
        // abstraction adds a layer of security to our program to
        // prevent users from creating a class that is too vague.
        // We can create abstract classes as well as abstract methods
        LearnAbstractionCarClass car = new LearnAbstractionCarClass();
        car.go();
    }
}
