import java.util.Comparator;

public class TwoSurname implements Comparator<Person> {

    private int maxWords;

    public TwoSurname() {
        this.maxWords = maxWords;
    }

    @Override
    public int compare(Person o1, Person o2) {
        String[] a1 = o1.getSurname().split("\\P{IsAlphabetic}+", maxWords);
        String[] a2 = o2.getSurname().split("\\P{IsAlphabetic}+", maxWords);
        if (a1.length > a2.length) {
            return -1;
        } else if (a1.length < a2.length) {
            return 1;
        } else {
            return Integer.compare(o2.getAge(), o1.getAge());
        }
    }
}