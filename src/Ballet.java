import java.util.ArrayList;

public class Ballet extends MusicalShow {
    String choreographer;

    public Ballet(Director director, int duration, ArrayList<Actor> listOfActors, String title, String librettoText, String musicAuthor, String choreographer) {
        super(director, duration, listOfActors, title, librettoText, musicAuthor);
        this.choreographer = choreographer;
    }
}
