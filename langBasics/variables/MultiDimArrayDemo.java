class MultiDimArrayDemo {
    public static void main(String[] arrays) {
        String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Khoa", "Helen"}
        };
        // Mr. Khoa
        System.out.println(names[0][0] + names[1][0]);
        // Ms. Helen
        System.out.println(names[0][2] + names[1][1]);
    }
}
