package main.singleresponsibilityprinciple.bad;

public class Car {
    private int glassCleanliness = 100;
    private int tiresCondition = 100;

    public int getGlassCleanliness() {
        return glassCleanliness;
    }

    public void setGlassCleanliness(int glassCleanliness) {
        this.glassCleanliness = glassCleanliness;
    }

    public int getTiresCondition() {
        return tiresCondition;
    }

    public void setTiresCondition(int tiresCondition) {
        this.tiresCondition = tiresCondition;
    }

    public void glassCleaning() {
        glassCleanliness = 100;
        System.out.println("Glass is clean now");
    }

    public void replaceTires() {
        tiresCondition = 100;
        System.out.println("Tires are new now");
    }
}
