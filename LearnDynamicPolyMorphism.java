import java.util.*;

public class LearnDynamicPolyMorphism {
    public static void main(String[] args) {
        // polymorphism = many forms/shapes
        // dynamic = after compilation (during runtime)
        // e.x a corvette is a: corvette, and a car, and a vehicle, and an object.

        Scanner scanner = new Scanner(System.in);
        LearnDynamicPolyMorphismAnimalClass animal;

        System.out.println("What animal do you want?");
        System.out.println("(1=dog) or (2=cat)");
        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new LearnDynamicPolyMorphismDogClass();
            animal.speak();
        }
        else if (choice == 2) {
            animal = new LearnDynamicPolyMorphismCatClass();
            animal.speak();
        }
        else {
            animal = new LearnDynamicPolyMorphismAnimalClass();
            System.out.println("That choice is invalid.");
            animal.speak();
        }
    }
}
