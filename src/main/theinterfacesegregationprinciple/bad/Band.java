package main.theinterfacesegregationprinciple.bad;

public class Band {
    Drummer drummer;
    Guitarist guitarist;
    Singer singer;

    public static void main(String[] args) {
        Band band = new Band();
        band.createBand();
        band.playSong();
    }

    public void createBand() {
        drummer = new Drummer();
        guitarist = new Guitarist();
        singer = new Singer();
    }

    void playSong() {
        try {
            drummer.playBeat();
            Thread.sleep(2000);
            singer.sing();
            guitarist.playRiff();
            Thread.sleep(3000);
            singer.playBeat();
            Thread.sleep(3000);
            drummer.playRiff();
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("The song is over");
        }
    }
}
