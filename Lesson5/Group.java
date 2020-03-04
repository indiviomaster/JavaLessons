package Lesson5;

import java.util.ArrayList;

public class Group {
    private String name;

    public ArrayList<Student> getStudents() {
        return students;
    }

    //private static int id=0;
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;
    public Group(String name){
        this.name = name;
       // this.id +=1;
    }
    public void addStudent(Student stud){
        students.add(stud);
    }
    public void addTeacher(Teacher teach){
        teachers.add(teach);
    }

}
