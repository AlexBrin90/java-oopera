public class Person {
    protected String name;
    protected String surname;
    protected Gender gender;

    public Person(String name, String surname, Gender gender) {
        this.gender = gender;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "name=" + name + ", surname='" + surname;
    }
}
