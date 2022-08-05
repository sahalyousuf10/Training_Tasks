import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

    public static void main(String[] args) {

        Student s1 = new Student(15213, "Sahal", 23);
        Student s2 = new Student(15245, "Faizan", 20);
        Student s3 = new Student(15236, "Osama", 19);
        Student s4 = new Student(15255, "Sufyan", 25);
        Student s5 = new Student(15210, "Salman", 21);
        Student s6 = new Student(15208, "Hassan", 20);
        Student s7 = new Student(15261, "Faizan", 22);
        Student s8 = new Student(15238, "Sufyan", 19);

        ArrayList<Student> list = new ArrayList();

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);
        list.add(s7);
        list.add(s8);

        System.out.println("Before Sorting the data\n");

        for (Student s:list){
            System.out.println("Student id: "+s.id+" Student Name: "+s.name+" Student Age: "+s.age);
        }

        System.out.println("\nSorting List in ascending order\n");
        Collections.sort(list);

        for (Student s:list){
            System.out.println("Student id: "+s.id+" Student Name: "+s.name+" Student Age: "+s.age);
        }

        Collections.sort(list, Collections.reverseOrder());

        System.out.println("\nSorting List in descending order\n");

        for (Student s:list){
            System.out.println("Student id: "+s.id+" Student Name: "+s.name+" Student Age: "+s.age);
        }
    }
}
