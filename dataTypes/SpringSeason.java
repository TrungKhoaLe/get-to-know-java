public class SpringSeason {
    public static void main(String[] args) {
        int m, d;
        m = Integer.parseInt(args[0]);
        d = Integer.parseInt(args[1]);

        boolean isSpring = (m == 3 && d >= 20 && d <= 31) ||
                           (m == 4 && d >=1 && d <= 30) ||
                           (m == 5 && d >= 1 && d <= 31) ||
                           (m == 6 && d >=1 && d <= 20);
        System.out.println(isSpring);
    }
}
