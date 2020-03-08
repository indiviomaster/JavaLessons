package Lesson5;

import java.util.ArrayList;

public class Teacher extends Person{

    private ArrayList<Group> groups;

    public Teacher(String surname, String name) {
        super(surname, name);
        groups = new ArrayList<>();
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void choiseGroup(Group group) {
        groups.add(group);
        group.addTeacher(this);
    }

    @Override
    public String toString() {
        return "Учитель " + name + " " + surname + " ";
    }
}