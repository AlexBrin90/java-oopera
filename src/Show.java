import java.util.ArrayList;
import java.util.Objects;

public class Show {
    String title; // название постановки
    int duration; // длительность в минутах
    Director director; // режиссёр
    ArrayList<Actor> listOfActors; // список актёров

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

    public void setActor(Actor newActor, Actor actorForChange) {
        System.out.println("Актер успешно заменен! " + actorForChange.surname + " больше не участвует в постановке. Вместо него теперь " + newActor.surname);
        listOfActors.remove(actorForChange);
        listOfActors.add(newActor);
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

        if (isChangeActor == false) {
            System.out.println("Актер " + surnameActorForChange + " отсутствует в списке актеров этой постановки.");
        }

    }

    public String getActors() {
        System.out.println("Список актеров постановки " + title);
        return listOfActors.toString();
    }
// todo написать метод вывода списка актеров для спектаклей


}
