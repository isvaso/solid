package main.thedependencyinversonprinciple.bad;

public class Song {
    Drummer drummer;

    public static void main(String[] args) {
        Song song = new Song();
        song.playSong();
    }

    public void playSong() {
        drummer = new Drummer();
        drummer.setUpDrumKit();
        drummer.playBeat();
    }
}
