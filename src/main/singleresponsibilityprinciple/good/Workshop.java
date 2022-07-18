package main.singleresponsibilityprinciple.good;

public class Workshop {

    public static void main(String[] args) {
        Workshop workshop = new Workshop();

        Car car = new Car();
        car.glassWorker.glassCleaning();

        Helicopter helicopter = new Helicopter();
        helicopter.glassWorker.glassCleaning();

        Bike bike = new Bike();
        bike.tiresWorker.replaceTires();
    }

}
