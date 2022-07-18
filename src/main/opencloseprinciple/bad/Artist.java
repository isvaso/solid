package main.opencloseprinciple.bad;

public class Artist {

    public static void main(String[] args) {
        Artist artist = new Artist();
        /*Pencil pencil = new Pencil();
        artist.draw(pencil);
        artist.erase(pencil);*/
        Pen pen = new Pen();

        artist.draw(pen);
        artist.erase(pen);
    }

    public void draw(Object object) {
        ((Pen) object).getDrawing();
    }

    public void erase(Object object) {
        ((Pencil) object).eraseDrawing();
    }
}
