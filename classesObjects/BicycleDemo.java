public class BicycleDemo {
    public static void main(String[] main) {
        Bicycle myBike = new Bicycle(1, 0, 1);
        
        System.out.println("ID: " + myBike.getID());
        System.out.println("The number of bicycles created: " + Bicycle.getNumberOfBicycles());
        System.out.println("Initial cadence value: " + myBike.getCadence());
        myBike.setCadence(3);
        System.out.println("New cadence value: " + myBike.getCadence());
        System.out.println("Initial gear value: " + myBike.getGear());
        myBike.setGear(6);
        System.out.println("New gear value: " + myBike.getGear());
        System.out.println("Initial speed value: " + myBike.getSpeed());
        myBike.speedUp(30);
        System.out.println("Sped up speed value: " + myBike.getSpeed());
        myBike.applyBreak(5);
        System.out.println("Speed after applying the break: " + myBike.getSpeed());
    }
}
