package main.thedependencyinversonprinciple.good.app;

import main.thedependencyinversonprinciple.good.interfaces.InterfaceDrummer;
import main.thedependencyinversonprinciple.good.musicians.DrumKit;
import main.thedependencyinversonprinciple.good.musicians.Drummer;

public class Song {
    InterfaceDrummer drummer;

    public static void main(String[] args) {
        Song song = new Song();
        song.playSong();
    }

    public void playSong() {
        drummer = new Drummer(new DrumKit());
        drummer.setUpDrumKit();
        drummer.playBeat();
    }
}
