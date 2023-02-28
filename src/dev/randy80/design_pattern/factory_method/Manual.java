package dev.randy80.design_pattern.factory_method;

public class Manual {
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
        return "Manual has " + seats + " seats, " + engine + " engine, " + tripComputer + " trip computer, " + gpsNavigator + " gps navigator";
    }
}
