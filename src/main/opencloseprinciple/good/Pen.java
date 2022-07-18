package main.opencloseprinciple.good;

public class Pen extends PenEraser implements ArtistTools {

    @Override
    public void getDrawing() {
        System.out.println("You got drawing by pen");
    }
}
