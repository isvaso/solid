package main.singleresponsibilityprinciple.bad;

public class Workshop {

    public static void main(String[] args) {
        Workshop workshop = new Workshop();
        Car car = new Car();
        workshop.repairAndCleaning(car);
    }

    /*public void repairAndCleaning(Car car) {
        car.glassCleaning();
        car.replaceTires();
    }*/

    public void repairAndCleaning(Object object) {
        if (object instanceof Car) {
            ((Car) object).glassCleaning();
            ((Car) object).replaceTires();
        }
        if (object instanceof Bike) {
            ((Bike) object).replaceTires();
        }
        if (object instanceof Helicopter) {
            ((Helicopter) object).glassCleaning();
        }
    }
}
