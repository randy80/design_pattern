package dev.randy80.design_pattern.factory_method;

public class Car {
    private int seats;
    private String engine;
    private boolean tripComputer;
    private boolean gpsNavigator;

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    public void setGPSNavigator(boolean gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public String toString() {
        return "Car has " + seats + " seats, " + engine + " engine, " + tripComputer + " trip computer, " + gpsNavigator + " gps navigator";
    }
}
