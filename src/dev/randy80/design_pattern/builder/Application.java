package dev.randy80.design_pattern.builder;

public class Application {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.makeSUV(carBuilder);
        Car car = carBuilder.getResult();
        System.out.println(car.toString());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.makeSUV(manualBuilder);
        Manual manual = manualBuilder.getResult();
        System.out.println(manual.toString());

        carBuilder = new CarBuilder();
        director.makeSportCar(carBuilder);
        car = carBuilder.getResult();
        System.out.println(car.toString());

        manualBuilder = new CarManualBuilder();
        director.makeSUV(manualBuilder);
        manual = manualBuilder.getResult();
        System.out.println(manual.toString());
    }
}
