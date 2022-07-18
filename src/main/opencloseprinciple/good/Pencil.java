package main.opencloseprinciple.good;

public class Pencil implements ArtistTools {

    @Override public void getDrawing() {
        System.out.println("You got drawing by pencil");
    }

    @Override public void eraseDrawing() {
        System.out.println("You erased drawing by pencil");
    }
}
