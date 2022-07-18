package main.theliskovsubstitutionprinciple.bad;

public class CarWashWorking {

    public static void main(String[] args) {
        CarWashWorking carWashWorking = new CarWashWorking();
        carWashWorking.calculatePrices(new Vehicle());
        carWashWorking.calculatePrices(new Bike());
    }

    public void calculatePrices(Vehicle vehicle) {
        int totalPrice;
        int wheelReplacementPrice;
        int windowWashingPrice;

        if (vehicle instanceof Vehicle) {
            wheelReplacementPrice = 100;
            windowWashingPrice = 60;
            totalPrice = wheelReplacementPrice * vehicle.numberOfWheels + windowWashingPrice * vehicle.numberOfWindows;
            System.out.println("Price for car: $" + totalPrice);
        }

        if (vehicle instanceof Bike) {
            wheelReplacementPrice = 90;
            windowWashingPrice = 0;
            totalPrice = wheelReplacementPrice * vehicle.numberOfWheels + windowWashingPrice * vehicle.numberOfWindows;
            System.out.println("Price for bike: $" + totalPrice);
        }

    }

}
