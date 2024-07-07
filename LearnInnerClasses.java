public class LearnInnerClasses {
    public static void main(String[] args) {
        /* inner class = A class inside another class.
         * Useful if a class should be limited in scope.
         * They are usually set to private, but thats not
         * necessary. The reason we use inner classes because
         * it helps group classes that belong together. It's 
         * extremely useful for listeners for specific events
         * Its precursor for anonymous inner classes. */

        LearnInnerClassesOutsideClass out = new LearnInnerClassesOutsideClass();
        LearnInnerClassesOutsideClass.LearnInnerClassesInsideClass in = out.new LearnInnerClassesInsideClass();

        System.out.println(out.x + in.y);
        in.greeting();
    }
}
