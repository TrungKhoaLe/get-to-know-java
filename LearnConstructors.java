public class LearnConstructors {
    public static void main(String[] args) {
        // constructor = special method that is called when an object is instantiated (created)
        LearnConstructorsHumanClass human = new LearnConstructorsHumanClass("KL", 20, 55);
        System.out.println(human.name);
        System.out.println(human.age);
        System.out.println(human.weight);

        human.eat();
        human.drink();
    }
}
