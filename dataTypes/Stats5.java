public class Stats5 {
    public static void main(String[] args) {
        double random_val_1 = Math.random();
        double random_val_2 = Math.random();
        double random_val_3 = Math.random();
        double random_val_4 = Math.random();
        double random_val_5 = Math.random();

        double avg = (random_val_1 + random_val_2 + random_val_3 + random_val_4 + random_val_5) / 5;
        double min = Math.min(random_val_1, Math.min(Math.min(random_val_2, random_val_3), Math.min(random_val_4, random_val_5)));
        double max = Math.max(random_val_1, Math.max(Math.max(random_val_2, random_val_3), Math.max(random_val_4, random_val_5)));

        System.out.println("Average: " + avg + ", Min: " + min + ", Max: " + max);
    }
}
