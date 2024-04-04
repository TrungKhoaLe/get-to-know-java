interface Bicycle {
    // in its most common form, the interface consists of
    // related methods with empty bodies
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBreaks(int decrement);
}
