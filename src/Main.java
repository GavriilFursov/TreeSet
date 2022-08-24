import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Jack", "Richer", 27));
        persons.add(new Person("Markus", "Berg ", 28));
        persons.add(new Person("Marshmallow", "Legend Ice", 20));
        persons.add(new Person("Andy", "Corner Jey Rodriguez", 18));
        Collections.sort(persons, new TwoSurname(2));
        for (Person p : persons) {
            System.out.println(p);
        }
    }
}