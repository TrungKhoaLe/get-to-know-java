class ConditionalDemo2 {
    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 2;
        int result;

        boolean someCondition = true;
        // read as: if someCondition is true assign the value of *value1* to the result.
        // Otherwise, assign the value of value2 to the result
        result = someCondition ? value1 : value2;
        System.out.println(result);
    }
}
