import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        Actor Habenskiy = new Actor("Константин", "Хабенский", Gender.MALE, 176);
        Actor Andreeva = new Actor("Паулина", "Андреева", Gender.FEMALE, 171);
        Actor Serebryakov = new Actor("Алексей", "Серебряков", Gender.MALE, 184);

        Person Zimmer = new Person("Ханс", "Циммер ", Gender.MALE);

        Person Pleseckiy = new Person("Майя", "Плисецкая", Gender.FEMALE);

        Director Zvyagincev = new Director("Андрей", "Звягинцев", Gender.MALE, 12);
        Director Bikov = new Director("Юрий", "Быков", Gender.MALE, 18);

        Show newShow = new Show(Zvyagincev, 120, new ArrayList<>(), "Обычное шоу");

        Opera newOpera = new Opera(Bikov, 150, new ArrayList<>(), "Просто опера", "Текст песни опера!", Zimmer, 12);

        Ballet newBallet = new Ballet(Zvyagincev, 200, new ArrayList<>(), "Такой себе балет", "Текст песни балет!", Zimmer, Pleseckiy);

        System.out.println("Распределить актёров по спектаклям. Используйте для этого метод добавления нового актёра в спектакль. Один актёр может участвовать в нескольких спектаклях.");
        newShow.addActor(Habenskiy);
        newShow.addActor(Andreeva);
        newOpera.addActor(Andreeva);
        newOpera.addActor(Serebryakov);
        newBallet.addActor(Habenskiy);
        newBallet.addActor(Andreeva);
        newBallet.addActor(Serebryakov);
        System.out.println("***************");
        System.out.println("Для каждого спектакля выведите на экран список актёров.");
        System.out.println(newShow.getActors());
        System.out.println(newOpera.getActors());
        System.out.println(newBallet.getActors());
        System.out.println("***************");
        System.out.println("Замените актёра в одном из спектаклей на актёра из другого спектакля и ещё раз выведите для него список актёров.");
        newOpera.changeActor(Habenskiy, "Серебряков");
        System.out.println(newOpera.getActors());
        System.out.println("***************");
        System.out.println("Попробуйте заменить в другом спектакле несуществующего актёра");
        newShow.changeActor(Serebryakov, "Зайцев");
        System.out.println(newShow.getActors());
        System.out.println("***************");
        System.out.println("Для оперного и балетного спектакля выведите на экран текст либретто.");
        System.out.println(newOpera.printLiberto());
        System.out.println(newBallet.printLiberto());
    }
}
