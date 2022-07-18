package main.theliskovsubstitutionprinciple.bad;

public class Vehicle {
    int numberOfWheels = 4;
    int numberOfWindows = 6;

    public int repairAndCleanPrice() {
        int totalPrice;
        int wheelReplacementPrice = 100;
        int windowWashingPrice = 60;

        totalPrice = wheelReplacementPrice * numberOfWheels + windowWashingPrice * numberOfWindows;
        return totalPrice;
    }
}
