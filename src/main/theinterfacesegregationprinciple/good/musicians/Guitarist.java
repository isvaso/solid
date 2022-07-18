package main.theinterfacesegregationprinciple.good.musicians;

import main.theinterfacesegregationprinciple.good.interfaces.InterfaceGuitarist;

public class Guitarist implements InterfaceGuitarist {

    @Override public void playRhythm() {
        System.out.println("Drummer started playing the rhythm");
    }

    @Override public void playRiff() {
        System.out.println("Drummer started playing the riff");
    }

    @Override public void sing() {
        System.out.println("Drummer started singing");
    }
}
