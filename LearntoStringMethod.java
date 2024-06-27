public class LearntoStringMethod {
    public static void main(String[] args) {
        // toString() = a special method that all objects inherit,
        // that returns a string that textually represents an object.
        // can be use both implicitly and explicitly.

        LearntoStringMethodCarClass car = new LearntoStringMethodCarClass();
        System.out.println(car); // this will display the addr. of the car object
        /* To display the textual information of an object, one of the ways we can accomplish this task is to print every attribute/field of the object like the following example
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.color);
        */
    }
}
