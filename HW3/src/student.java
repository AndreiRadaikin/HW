
public class student {

   private String name;
   private static Integer currentID = 0;
   private Integer id;
   private Groups groups;

    public student(String name, Integer id,Groups groups) {
        this.name = name;
        this.id = id;
        this.groups = groups;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Integer getCurrentID() {
        return currentID;
    }

    public static void setCurrentID(Integer currentID) {
        student.currentID = currentID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Groups getGroups() {
        return groups;
    }

    public void setGroups(Groups groups) {
        this.groups = groups;
    }
}
