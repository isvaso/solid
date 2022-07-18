package main.opencloseprinciple.good;

public class Artist {

    public static void main(String[] args) {
        Artist artist = new Artist();
        Pencil pencil = new Pencil();
        Pen pen = new Pen();

        artist.draw(pencil);
        artist.erase(pencil);

        artist.draw(pen);
        artist.erase(pen);
    }

    public void draw(ArtistTools artistTools) {
        artistTools.getDrawing();
    }

    public void erase(ArtistTools artistTools) {
        artistTools.eraseDrawing();
    }
}
