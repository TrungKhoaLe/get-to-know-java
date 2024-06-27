public class LearnOverloadedConstructors {
    public static void main(String[] args) {
        // overloaded constructors = multiple constructors within a class with the same name
        // but have different parameters
        // name + parameters = signature
        //
        LearnOverloadedConstructorsPizzaClass myPizza = new LearnOverloadedConstructorsPizzaClass("bread1", "sauce1", "cheese1", "topping1");
        LearnOverloadedConstructorsPizzaClass myPizza2 = new LearnOverloadedConstructorsPizzaClass("bread2", "sauce2", "cheese2");
        LearnOverloadedConstructorsPizzaClass myPizza3 = new LearnOverloadedConstructorsPizzaClass("bread3", "sauce3");

    }
}
