import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Jack", "Richer", 27));
        persons.add(new Person("Markus", "Berg ", 28));
        persons.add(new Person("Marshmallow", "Legend Ice", 20));
        persons.add(new Person("Andy", "Corner Jey Rodriguez", 18));
        Predicate<Person> personPredicate = person -> person.getAge() < 21;
        persons.removeIf(personPredicate);
        Collections.sort(persons, new TwoSurname());
        for (Person p : persons) {
            System.out.println(p);
        }
    }
}