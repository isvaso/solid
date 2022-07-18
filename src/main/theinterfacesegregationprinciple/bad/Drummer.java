package main.theinterfacesegregationprinciple.bad;

public class Drummer implements Musician{

    @Override public void playRiff() {
        System.err.println("Drummer can't play riff");
    }

    @Override public void playBeat () {
        System.out.println("Drummer started playing the beat");
    }

    @Override public void playRhythm() {
        System.out.println("Drummer started playing the rhythm");
    }

    @Override public void sing() {
        System.out.println("Drummer started singing");
    }
}
