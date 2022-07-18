package main.theinterfacesegregationprinciple.good.app;

import main.theinterfacesegregationprinciple.good.interfaces.*;
import main.theinterfacesegregationprinciple.good.musicians.*;

public class Band {

    InterfaceDrummer drummer;
    InterfaceGuitarist guitarist;
    InterfaceSinger singer;

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
            guitarist.playRhythm();
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("The song is over");
        }
    }
}
