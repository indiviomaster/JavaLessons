package Lesson5;

import java.util.ArrayList;

public class Teacher extends Person{

    private ArrayList<Group> groups;

    public Teacher(String surname, String name) {
        super(surname, name);
        groups = new ArrayList<>();
    }

    public ArrayList<Group> getGroup() {
        return groups;
    }

    public void addGroup(Group grp) {
        groups.add(grp);

    }

    @Override
    public String toString() {
        return "Teacher{" + name + " " + surname + "}";
    }
}