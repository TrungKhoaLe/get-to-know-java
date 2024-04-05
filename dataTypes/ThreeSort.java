public class ThreeSort {
    public static void main(String[] args) {
        int num_1 = Integer.parseInt(args[0]);
        int num_2 = Integer.parseInt(args[1]);
        int num_3 = Integer.parseInt(args[2]);

        int min_val = Math.min(num_1, Math.min(num_2, num_3));
        int max_val = Math.max(num_1, Math.max(num_2, num_3));

        int mid_val = num_1 + num_2 + num_3 - min_val - max_val;

        System.out.println(min_val);
        System.out.println(mid_val);
        System.out.println(max_val);
    }

}
