package main.theliskovsubstitutionprinciple.good;

public class Bike implements Vehicle {
    private String name = "";
    private int numberOfWheels  = 2;

    public Bike(String name) {
        this.name = name;
    }

    @Override public int repairAndCleanPrice() {
        int totalPrice;
        int wheelReplacementPrice = 90;

        totalPrice = wheelReplacementPrice * numberOfWheels;
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
}
