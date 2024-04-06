class PrePostDemo {
    public static void main(String[] args) {
        int i = 3;
        i++;
        // i is 4
        System.out.println(i);
        ++i;
        // i is 5
        System.out.println(i);
        // i is 6
        System.out.println(++i); // The prefix version evaluates to the incremented value.
        // i is 6
        System.out.println(i++); // The postfix version evaluates to the original value.
        // i is 7
        System.out.println(i);
    }
}
