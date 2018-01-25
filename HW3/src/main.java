import java.util.*;

public class main {

    public static void Print (student student){
        System.out.print(student.getName().toString());
    }

    public static void main(String[] args) {

        ArrayList students = new ArrayList();

        student student1 = new student("Vasia",student.getCurrentID(),Groups.AE154);
        student student2 = new student("Kvasia",student.getCurrentID(),Groups.AE151);
        student student3 = new student("Vasilisa",student.getCurrentID(),Groups.AE155);



        students.add(student1);
        students.add(student2);
        students.add(student3);



                System.out.println("Not sorted:");


        // TODO: 22.01.2018 Make iterator to fix output

        for (int i = 0 ; i < students.size() ; i++ ) {
            Print(students.);
        }

        System.out.println("Sorted:");

        for (int i = 0 ; i < students.size() ; i++ ) {
            Print(students.);
        }


        students.sort(Comparator.comparing(student::getName));




    }
}
