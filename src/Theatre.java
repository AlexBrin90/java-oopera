import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        //Ballet(Director director, int duration, ArrayList<Actor> listOfActors, String title, String librettoText, String musicAuthor, String choreographer)
        //todo переделать автора музыки и хореографа в объекты Person
        Actor Habenskiy = new Actor("Константин", "Хабенский", Gender.MALE, 176);
        Actor Andreeva = new Actor("Паулина", "Андреева", Gender.FEMALE, 171);
        Actor Serebryakov = new Actor("Алексей", "Серебряков", Gender.MALE, 184);

        Director Zvyagincev = new Director("Андрей", "Звягинцев", Gender.MALE, 12);
        Director Bikov = new Director("Юрий", "Быков", Gender.MALE, 18);

        Show newShow = new Show(Zvyagincev, 120, new ArrayList<>(), "Обычное шоу");

        Opera newOpera = new Opera(Bikov, 150, new ArrayList<>(), "Просто опера", "Текст песни!", "Иванов Иван", 12);

        Ballet newBallet = new Ballet(Zvyagincev, 200, new ArrayList<>(), "Такой себе балет", "Текст песни!", "Иванов Иван", "Петров Петр");

        newShow.addActor(Habenskiy);
        newShow.addActor(Andreeva);
        newOpera.addActor(Andreeva);
        newOpera.addActor(Serebryakov);
        newBallet.addActor(Habenskiy);
        newBallet.addActor(Andreeva);
        newBallet.addActor(Serebryakov);
        newShow.addActor(Habenskiy);
        System.out.println("***************");
        newShow.changeActor(Habenskiy, "Серебряков");
        System.out.println("***************");
        newShow.changeActor(Serebryakov, "Хабенский");
        System.out.println("***************");
        System.out.println(newShow.getActors());
        System.out.println("***************");
        System.out.println(newOpera.getActors());
        System.out.println("***************");

    }
}
