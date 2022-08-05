import java.util.*;
public class Student implements Comparable<Student>{
    public int id;
    public String name;
    public int age;

    Student(int id, String name, int age){

        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int compareTo(Student st){

        if(this.name.equals(st.name)){
            return this.age - st.age;
        }

        return name.compareTo(st.name);
    }

}
