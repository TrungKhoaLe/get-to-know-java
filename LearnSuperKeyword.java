public class LearnSuperKeyword {
    public static void main(String[] args) {
        // super = keyword that refers to the superclass (parent class) of an object
        // similar to the 'this' keyword.

        LearnSuperKeywordHeroClass hero1 = new LearnSuperKeywordHeroClass("Batman", 42, "$$$");
        LearnSuperKeywordHeroClass hero2 = new LearnSuperKeywordHeroClass("Thor", 220, "Magic");
        System.out.println(hero1.name);
        System.out.println(hero1.age);
        System.out.println(hero1.power);

        System.out.println(hero2.name);
        System.out.println(hero2.age);
        System.out.println(hero2.power);

        System.out.println(hero2);

    }
}
