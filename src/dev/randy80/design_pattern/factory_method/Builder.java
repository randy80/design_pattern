package dev.randy80.design_pattern.factory_method;

public interface Builder {
    void reset();
    void setSeats(int number);
    void setEngine(String engine);
    void setTripComputer(boolean tripComputer);
    void setGPSNavigator(boolean gpsNavigator);
}
