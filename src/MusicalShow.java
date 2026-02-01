import java.util.ArrayList;

public class MusicalShow extends Show {
    private String musicAuthor;
    private String librettoText;

    public MusicalShow(Director director, int duration, ArrayList<Actor> listOfActors, String title, String librettoText, String musicAuthor) {
        super(director, duration, listOfActors, title);
        this.librettoText = librettoText;
        this.musicAuthor = musicAuthor;
    }

    public String printLiberto() {
        return librettoText;
    }

}
