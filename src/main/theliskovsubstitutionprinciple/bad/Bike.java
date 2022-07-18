package main.theliskovsubstitutionprinciple.bad;

public class Bike extends Vehicle{
    int numberOfWheels = 4;

    @Override public int repairAndCleanPrice() {
        int totalPrice;
        int wheelReplacementPrice = 90;

        totalPrice = wheelReplacementPrice * numberOfWheels;
        return totalPrice;
    }
}
