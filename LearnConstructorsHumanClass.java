public class LearnConstructorsHumanClass {
    String name;
    int age;
    double weight;

    LearnConstructorsHumanClass(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void eat() {
        // System.out.println(this.name + " is eating."); either way works.
        System.out.println(name + " is eating.");
    }
    
    public void drink() {
        // System.out.println(this.name + " is drinking."); either way works.
        System.out.println(name + " is drinking.");
    }
}
