public class LearnMethodOverriding {
    public static void main(String[] args) {
        // method overriding = declaring a method in a sub class, which is 
        // already present in the parent class. Done so that a sub class can
        // give its own implementation.
        //

        LearnMethodOverridingAnimalClass animal = new LearnMethodOverridingAnimalClass();
        LearnMethodOverridingDogClass dog = new LearnMethodOverridingDogClass();
        animal.speak();
        dog.speak();
    }
}
