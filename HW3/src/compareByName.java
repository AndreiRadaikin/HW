import java.util.Comparator;

public abstract class compareByName implements Comparator<student> {

    @Override
    public int compare (student s1, student s2){
        return s1.getName().compareTo(s2.getName());
    }

}
