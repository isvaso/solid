package main.theinterfacesegregationprinciple.bad;

public class Guitarist implements Musician {

    @Override public void playRiff() {
        System.out.println("Guitarist started playing the riff");
    }

    @Override public void playBeat() {
        System.err.println("Guitarist can't play beat");
    }

    @Override public void playRhythm() {
        System.out.println("Guitarist started playing the rhythm");
    }

    @Override public void sing() {
        System.out.println("Guitarist started singing");
    }
}
