class ACMEBicycle implements Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;
    // The compiler will now require that methods,
    // changeCadence, changeGear, speedUp, and applyBreaks
    // all be implemented.
    
    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    public void changeGear(int newValue) {
        gear = newValue;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public void applyBreaks(int decrement) {
        speed -= decrement;
    }

    void printStates() {
        System.out.println("cadence:" + 
                cadence + " speed:" + speed +
                " gear:" + gear);
    }
}
