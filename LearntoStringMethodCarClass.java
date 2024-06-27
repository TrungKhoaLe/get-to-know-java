public class LearntoStringMethodCarClass {

    String make = "Honda";
    String model = "CRV";
    int year = 2020;
    String color = "red";

    @Override
    public String toString() {
    /*
     * The default behaviour of this toString method is to return the addr. of an object. Now we overrode and converted it to display textual information. The method is called behind the scene when we try to print an instance.
     */
        String myString = make + "\n" + model + "\n" + color + "\n" + year;
        return myString;
    }
}
