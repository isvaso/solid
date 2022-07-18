package main.theinterfacesegregationprinciple.bad;

public class Singer implements Musician {

    @Override public void playRiff() {
        System.err.println("Singer can't play the riff");
    }

    @Override public void playBeat() {
        System.err.println("Singer can't play the beat");
    }

    @Override public void playRhythm() {
        System.err.println("Singer can't play the rhythm");
    }

    @Override public void sing() {
        System.out.println("Singer started sing");
    }
}
