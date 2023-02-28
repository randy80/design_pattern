package dev.randy80.design_pattern.builder;

public interface Builder {
    void reset();
    void setSeats(int number);
    void setEngine(String engine);
    void setTripComputer(boolean tripComputer);
    void setGPSNavigator(boolean gpsNavigator);
}
