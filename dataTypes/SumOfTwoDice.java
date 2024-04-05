public class SumOfTwoDice {
    public static void main(String[] args) {
        int min = 1;
        int max = 6;
        int dice1 = (int)(Math.random() * max) + min;
        int dice2 = (int)(Math.random() * max) + min;
        int sum = dice1 + dice2;
        System.out.println(sum);
    }
}

