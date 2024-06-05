public class TopLevelClass {
    void accessMembers(OuterClass outer) { 
        // System.out.println(OuterClass.outerField); // this yields the compiler error: Cannot make a static reference to the non-static field outerField
        System.out.println(outer.outerField);
        System.out.println(OuterClass.staticOuterField);
    }
}
