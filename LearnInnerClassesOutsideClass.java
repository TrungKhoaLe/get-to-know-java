public class LearnInnerClassesOutsideClass {
    // can be private class
    String x = "Hello ";

    public class LearnInnerClassesInsideClass {
        String y = "World!";    

        public void greeting() {
            System.out.println(x + y);
        }
    }
}
