import java.util.ArrayList;
import java.util.Objects;

public class Show {
    protected String title; // название постановки
    protected int duration; // длительность в минутах
    protected Director director; // режиссёр
    protected ArrayList<Actor> listOfActors; // список актёров

    public Show(Director director, int duration, ArrayList<Actor> listOfActors, String title) {
        this.director = director;
        this.duration = duration;
        this.listOfActors = listOfActors;
        this.title = title;
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актер " + actor.surname + " уже играет в постановке " + this.title + ".");
        } else {
            listOfActors.add(actor);
            System.out.println("Актер " + actor.surname + " успешно добавлен в постановку " + this.title + ".");
        }

    }

    private void setActor(Actor newActor, Actor actorForChange) {
        listOfActors.remove(actorForChange);
        listOfActors.add(newActor);
        System.out.println("Актер успешно заменен! " + actorForChange.surname + " больше не участвует в постановке. Вместо него теперь " + newActor.surname);
    }

    public void changeActor(Actor newActor, String surnameActorForChange) {
        boolean isChangeActor = true;
        Actor actorForChange;
        for (Actor a : listOfActors) {
            if (Objects.equals(a.surname, surnameActorForChange)) {
                actorForChange = a;
                setActor(newActor, actorForChange);
                return;
            } else {
                isChangeActor = false;
            }
        }

        if (!isChangeActor) {
            System.out.println("Актер " + surnameActorForChange + " отсутствует в списке актеров этой постановки.");
        }
    }

    public void getActors() {
        System.out.println("Список актеров постановки " + title);
        System.out.println(listOfActors);
    }
}
