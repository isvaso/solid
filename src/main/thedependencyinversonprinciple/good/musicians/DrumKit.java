package main.thedependencyinversonprinciple.good.musicians;

import main.thedependencyinversonprinciple.good.interfaces.*;

public class DrumKit implements InterfaceDrumKit {

    @Override public void setUp() {
        System.out.println("Drum kit is set up");
    }
}
