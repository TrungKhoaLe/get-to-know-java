public class LearnEncapsulation {
    public static void main(String[] args) {
        // Encapsulation = attributes of a class will be hidden or private.
        // Can be accessed through methods (getters and setters). We should
        // make attributes private if we don't have a reason to make them
        // public or protected.
        
        LearnEncapsulationCarClass car = new LearnEncapsulationCarClass("Subaru", "Outback", 2025);
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        car.setYear(2024);
        System.out.println(car.getYear());
    }
}
