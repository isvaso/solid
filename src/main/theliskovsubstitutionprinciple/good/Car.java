package main.theliskovsubstitutionprinciple.good;

public class Car implements Vehicle {
    private String name = "";
    private int numberOfWheels = 4;
    private int numberOfWindows = 6;

    public Car(String name) {
        this.name = name;
    }

    @Override public int repairAndCleanPrice() {
        int totalPrice;
        int wheelReplacementPrice = 100;
        int windowWashingPrice = 60;

        totalPrice = wheelReplacementPrice * numberOfWheels + windowWashingPrice * numberOfWindows;
        return totalPrice;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }
}


