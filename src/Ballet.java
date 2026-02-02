import java.util.ArrayList;

public class Ballet extends MusicalShow {
    Person choreographer;

    public Ballet(Director director, int duration, ArrayList<Actor> listOfActors, String title, String librettoText, Person musicAuthor, Person choreographer) {
        super(director, duration, listOfActors, title, librettoText, musicAuthor);
        this.choreographer = choreographer;
    }
}
