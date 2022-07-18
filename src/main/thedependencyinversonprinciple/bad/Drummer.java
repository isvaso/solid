package main.thedependencyinversonprinciple.bad;

public class Drummer {
    DrumKit drumKit;

    public void setUpDrumKit() {
        drumKit = new DrumKit();
        drumKit.setUp();
    }

    public void playBeat() {
        System.out.println("Plays beat");
    }
}
