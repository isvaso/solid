package main.singleresponsibilityprinciple.good;

public class GlassWorker {
    private int glassCleanliness = 100;

    public int getGlassCleanliness() {
        return glassCleanliness;
    }

    public void setGlassCleanliness(int glassCleanliness) {
        this.glassCleanliness = glassCleanliness;
    }

    public void glassCleaning() {
        glassCleanliness = 100;
        System.out.println("Glass is clean now");
    }
}
