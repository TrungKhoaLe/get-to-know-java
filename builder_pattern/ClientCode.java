//package builder_pattern;
import builders.CarBuilder;
import builders.CarManualBuilder;
import cars.Car;
import cars.Manual;
import director.Director;

public class ClientCode {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSUV(builder);

        Car car = builder.getResult();
        System.out.println("Does this car have a trip computer: " + car.getTripComputer());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSUV(manualBuilder);
        Manual carManual = manualBuilder.getResult();
    }
}

