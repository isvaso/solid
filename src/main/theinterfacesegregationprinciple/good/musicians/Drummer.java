package main.theinterfacesegregationprinciple.good.musicians;

import main.theinterfacesegregationprinciple.good.interfaces.InterfaceDrummer;

public class Drummer implements InterfaceDrummer {

    @Override public void playRhythm() {
        System.out.println("Drummer started playing the rhythm");
    }

    @Override public void playBeat() {
        System.out.println("Drummer started playing the beat");
    }

    @Override public void sing() {
        System.out.println("Drummer started singing");
    }
}
