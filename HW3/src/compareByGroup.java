import java.util.Comparator;

public abstract class compareByGroup implements Comparator<student> {
    @Override
    public int compare (student s1, student s2) {
        return s1.getGroups().toString().compareTo(s2.getGroups().toString());
    }
}
