package main.theliskovsubstitutionprinciple.good;

public class CarWashWorking {

    public static void main(String[] args) {
        CarWashWorking carWashWorking = new CarWashWorking();
        carWashWorking.calculatePrices(new Car("Car 1"));
        carWashWorking.calculatePrices(new Bike("Bike 1"));
    }

    public void calculatePrices(Vehicle vehicle) {
        System.out.println("Price for " + vehicle.getName() + ": $" + vehicle.repairAndCleanPrice());
    }
}
