import java.util.Objects;

public class Actor extends Person{
    int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Actor{name=" + name + ", surname='" + surname + " (height=" + height + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Actor newActor = (Actor) o;
        return Objects.equals(name, newActor.name) &&
                Objects.equals(surname, newActor.surname) &&
                (height == newActor.height);
    }

    @Override
    public int hashCode() {
        int hash = 17;
        if (name != null) {
            hash += name.hashCode();
        }
        hash *= 31;

        if (surname != null) {
            hash += surname.hashCode();
        }
        hash += height * 29;
        return hash;
    }
}
