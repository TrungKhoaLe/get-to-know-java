class InterfaceDemo {
    public static void main(String[] args) {
        // create a new ACME bicycle object
        ACMEBicycle acmeBicycle = new ACMEBicycle();
        
        // invoke methods on the created object
        acmeBicycle.changeCadence(50);
        acmeBicycle.changeGear(2);
        acmeBicycle.speedUp(20);
        acmeBicycle.applyBreaks(10);
        
        // print the results
        acmeBicycle.printStates();
    }
}
