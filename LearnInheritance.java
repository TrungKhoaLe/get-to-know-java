public class LearnInheritance {
    public static void main(String[] args) {
        // inheritance = the process of one class acquires the attributes or
        // methods of another.
        //
        System.out.println("===Hey, this section is for me, the car object.===");
        LearnInheritanceCarClass car = new LearnInheritanceCarClass();
        System.out.println("A car has " + car.doors + " doors.");
        System.out.println("A car has " + car.wheels + " wheels.");
        car.go();
        car.stop();
        
        System.out.println("===Hey, this section is for me, the bicyle object===");
        LearnInheritanceBicycleClass bicycle = new LearnInheritanceBicycleClass();
        System.out.println("A bicycle has " + bicycle.pedals + " pedals.");
        System.out.println("A bicycle has " + bicycle.wheels + " wheels.");
        bicycle.go();
        bicycle.stop();

    }
}
