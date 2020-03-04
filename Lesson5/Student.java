package Lesson5;

public class Student extends Person {

    private Group group;

    public Student(String surname, String name) {
        super(surname, name);

    }

    public Group getGroup() {
        return group;
    }

    public void choiceGroup(Group grp) {
        this.group = grp;
        grp.addStudent(this);
    }

    @Override
    public String toString() {
        return "Student{" + name + " " + surname + "}";
    }
}



