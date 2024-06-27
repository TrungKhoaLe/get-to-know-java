public class LearnOverloadedConstructorsPizzaClass {
    String bread;
    String sauce;
    String cheese;
    String topping;

    LearnOverloadedConstructorsPizzaClass(String bread, String sauce,
                                          String cheese, String topping) 
    {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }

    LearnOverloadedConstructorsPizzaClass(String bread,
                                          String sauce,
                                          String cheese) 
    {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    LearnOverloadedConstructorsPizzaClass(String bread,
                                          String sauce) 
    {
        this.bread = bread;
        this.sauce = sauce;
    }
}
