import java.util.Comparator;

public abstract class compareByID implements Comparator<student> {
    @Override
    public int compare (student s1, student s2) {
        if(s1.getId() > s2.getId()){
            return 1;
        }
        else if(s1.getId() < s2.getId()){
            return -1;
        }
         else {
            return 0;
        }
    }


}
