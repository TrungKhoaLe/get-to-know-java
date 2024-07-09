package cars;
import components.Engine;
import components.GPSNavigator;
import components.Transmission;
import components.TripComputer;

public class Manual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public String print() {
    
        String info = "";
        info += "Type of car: " + carType + "\n";
        info += "# seats: " + seats + "\n";
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
        info += "Transmission: " + transmission + "\n";

        if (tripComputer != null) {
            info += "Trip computer: Functional" + "\n";
        } else {
            info += "Trip computer: NA" + "\n";
        }

        if (gpsNavigator != null) {
            info += "GPS navigator: Functional" + "\n";
        } else {
            info += "GPS navigator: NA" + "\n";
        }
        return info;
    }
}
