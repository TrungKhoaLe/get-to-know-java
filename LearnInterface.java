public class LearnInterface {
    public static void main(String[] args) {
        // interface = a template that can be applied to a class.
        // similar to inheritance, but specifies what a class has/must do
        // classes can apply more than one interface, inheritance is limited to one super class
        LearnInterfaceRabbitClass rabbit = new LearnInterfaceRabbitClass();
        rabbit.flee();

        LearnInterfaceHawkClass hawk = new LearnInterfaceHawkClass();
        hawk.hunt();

        LearnInterfaceFishClass fish = new LearnInterfaceFishClass();
        fish.flee();
        fish.hunt();
    }
}
