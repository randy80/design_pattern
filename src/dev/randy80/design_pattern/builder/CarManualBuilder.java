package dev.randy80.design_pattern.builder;

public class CarManualBuilder implements Builder {
    private Manual manuel;

    @Override
    public void reset() {
        this.manuel = new Manual();
    }

    @Override
    public void setSeats(int seats) {
        this.manuel.setSeats(seats);
    }

    @Override
    public void setEngine(String engine) {
        this.manuel.setEngine(engine);
    }

    @Override
    public void setTripComputer(boolean tripComputer) {
        this.manuel.setTripComputer(tripComputer);
    }

    @Override
    public void setGPSNavigator(boolean gpsNavigator) {
        this.manuel.setGPSNavigator(gpsNavigator);
    }

    public Manual getResult() {
        return this.manuel;
    }
}
