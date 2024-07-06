public class LearnPolyMorphism {
    public static void main(String[] args) {
        // polymorphism = poly - "many", morph = "form"
        // The ability of an object to identify as more than one type
        
        LearnPolyMorphismCarClass car = new LearnPolyMorphismCarClass();
        LearnPolyMorphismBicycleClass bicycle = new LearnPolyMorphismBicycleClass();
        LearnPolyMorphismBoatClass boat = new LearnPolyMorphismBoatClass();
        LearnPolyMorphismVehicleClass[] racers = {car, bicycle, boat};

        for (LearnPolyMorphismVehicleClass x: racers) {
            x.go();
        }
    }
}
