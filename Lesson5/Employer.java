package Lesson5;

public class Employer extends PersonN {
    protected int salary;
    protected String email, phone;

    public Employer(String surname, String name, String lastname, String email, String phone, int salary, int age) {
        super(surname, name, lastname, age);
        this.salary = salary;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "{" + surname + " " + name+ " " + lastname + " " + email+ " " + phone+ " " +salary + " " + age+ "}";
    };

}
