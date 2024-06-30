public class LearnSuperKeywordHeroClass extends LearnSuperKeywordHumanClass {
    String power;

    LearnSuperKeywordHeroClass(String name, int age, String power) {
        super(name, age);
        this.power = power;
    }

    public String toString() {
        return super.toString() + power;
    }
}
