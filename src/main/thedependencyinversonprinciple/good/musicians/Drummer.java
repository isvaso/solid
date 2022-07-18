package main.thedependencyinversonprinciple.good.musicians;

import main.thedependencyinversonprinciple.good.interfaces.*;

public class Drummer implements InterfaceDrummer {
    private DrumKit drumKit;

    public Drummer(DrumKit drumkit) {
        this.drumKit = drumkit;
    }

    @Override public void setUpDrumKit() {
        this.drumKit.setUp();
    }

    @Override public void playBeat() {
        System.out.println("Plays beat");
    }
}
