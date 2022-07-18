package main.singleresponsibilityprinciple.good;

public class TiresWorker {
    private int tiresCondition = 100;

    public int getTiresCondition() {
        return tiresCondition;
    }

    public void setTiresCondition(int tiresCondition) {
        this.tiresCondition = tiresCondition;
    }

    public void replaceTires() {
        tiresCondition = 100;
        System.out.println("Tires are new now");
    }
}
