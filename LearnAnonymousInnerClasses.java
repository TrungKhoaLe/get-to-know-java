public class LearnAnonymousInnerClasses {
    public static void main(String[] args) {
        /* anonymous class = an inner class without a name
         * only a single object is created from one when we use it
         * The object may have "extras" or "changes" and no need to create
         * a separate innerclass when it only needs it once.
         * Helps us to avoid cluttering code with a separate class name
         * Syntax is very similar to a constructor,
         * except that there is also a class definition that comes afterwards
         * within a block of code.
         * GREAT FOR ACTION LISTENERS
         */
        LearnAnonymousInnerClassesGreetingClass greeting = new LearnAnonymousInnerClassesGreetingClass() {
            @Override
            public void welcome() {
                System.out.println("Yo bro!");
            }
       };
        LearnAnonymousInnerClassesGreetingClass greeting2 = new LearnAnonymousInnerClassesGreetingClass();

       greeting.welcome();
       greeting2.welcome();
    }
}
