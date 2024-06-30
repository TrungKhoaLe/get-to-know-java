public class LearnInterfaceFishClass implements LearnInterfacePreyInterface, LearnInterfacePredatorInterface {
    @Override
    public void flee() {
        System.out.println("The fish is fleeing.");
    }

    public void hunt() {
        System.out.println("The fish is hunting.");
    }
}
