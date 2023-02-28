package dev.randy80.design_pattern.builder;

public class Director {
    public void makeSUV(Builder builder) {
        builder.reset();
        builder.setSeats(4);
        builder.setEngine("V6");
        builder.setTripComputer(true);
        builder.setGPSNavigator(true);
    }

    public void makeSportCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("V8");
        builder.setTripComputer(true);
        builder.setGPSNavigator(false);
    }
}
