package Lesson5;

public class TestClassmate {

    public static void main(String[] args) {
        Student [] students = new Student[10];
        Teacher teacher1 = new Teacher("Иванов", "Сергей");
        Group group1 = new Group("Math");
        Teacher teacher2 = new Teacher("Петров", "Василий");
        Teacher teacher3 = new Teacher("Сидоров","Артем");

        Group group2 = new Group("Eco");
        //Group group3 = new Group("Golf");

        teacher1.choiseGroup(group1);
        group2.addTeacher(teacher2);
        group1.addTeacher(teacher3);

        students[0] = new Student("Иванов", "Петр");
        students[1] = new Student("Сидоров", "Василий");
        students[2] = new Student("Николаев", "Сергей");
        students[3] = new Student("Егоров", "Артем");
        students[4] = new Student("Никонов", "Григорий");
        students[5] = new Student("Вершинин", "Алексей");
        students[6] = new Student("Голубева", "Евгения");
        students[7] = new Student("Тарасова", "Ольга");
        students[8] = new Student("Никулина", "Анна");
        students[9] = new Student("Мирошина", "Александра");

        for (int i = 0; i < 5; i++) {
        students[i].choiceGroup(group1);
        }
        for (int i = 5; i < 10; i++) {
            students[i].choiceGroup(group2);
        }
        System.out.println("Группа 1");
        for (Student student : group1.getStudents()) {
            System.out.println(student);
        }
        for (Teacher teacher : group1.getTeachers()) {
            System.out.println(teacher);
        }
        System.out.println("Группа 2");
        for (Student student : group2.getStudents()) {
            System.out.println(student);
        }
        for (Teacher teacher : group2.getTeachers()) {
            System.out.println(teacher);
        }
    }
}