public class LearnArrayOfObjects {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        char[] characters = new char[4];
        String[] strings = new String[5];

        LearnArrayOfObjectsFoodClass[] refrigerator = new LearnArrayOfObjectsFoodClass[3];

        LearnArrayOfObjectsFoodClass food1 = new LearnArrayOfObjectsFoodClass("rice");
        LearnArrayOfObjectsFoodClass food2 = new LearnArrayOfObjectsFoodClass("salmon");
        LearnArrayOfObjectsFoodClass food3 = new LearnArrayOfObjectsFoodClass("kiwi");

        refrigerator[0] = food1;
        refrigerator[1] = food2;
        refrigerator[2] = food3;
        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);
    }
}
