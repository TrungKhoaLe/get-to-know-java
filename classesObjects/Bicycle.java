public class Bicycle {
    private int cadence;
    private int gear;
    private int speed;

    private int id;
    private static int numberOfBicycles = 0;

    public Bicycle(int startCadence,
                   int startSpeed,
                   int startGear) {
        this.gear = startGear;
        this.cadence = startCadence;
        this.speed = startSpeed;
        this.id = ++numberOfBicycles;
    }

    public int getID() {
        return id;
    }

    public static int getNumberOfBicycles() {
        return numberOfBicycles;
    }

    public int getCadence() {
        return cadence;
    }

    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public int getSpeed() {
        return speed;
    }

    public void applyBreak(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }
}
