package builders;
import cars.CarType;
import components.Engine;
import components.Transmission;
import components.TripComputer;
import components.GPSNavigator;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
