package dev.randy80.design_pattern.factory_method;

public class CarBuilder implements Builder {
    private Car car;

    @Override
    public void reset() {
        car = new Car();
    }

    @Override
    public void setSeats(int seats) {
        car.setSeats(seats);
    }

    @Override
    public void setEngine(String engine) {
        car.setEngine(engine);
    }

    @Override
    public void setTripComputer(boolean tripComputer) {
        car.setTripComputer(tripComputer);
    }

    @Override
    public void setGPSNavigator(boolean gpsNavigator) {
        car.setGPSNavigator(gpsNavigator);
    }

    public Car getResult() {
        return car;
    }
}
