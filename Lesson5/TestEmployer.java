package Lesson5;

public class TestEmployer {
    public static void main(String[] args) {
        Employer [] emp = new Employer[10];
        /*for (int i = 0; i < 10; i++){
            emp[i] = new Employer("ivanov"+i, "ivan"+i, "iva"+i+"@gmail.com","+7555333222"+i, 15000+i*1000 ,20+i);
        }*/

        emp[0] = new Employer("Иванов", "Петр","Васильевич" ,"ivapet@gmail.com","+75553332222", 150000 ,29);
        emp[1] = new Employer("Сидоров", "Василий","Сергеевич" ,"siva@gmail.com","+78283334222", 250000 ,45);
        emp[2] = new Employer("Николаев", "Сергей","Дмитриевич" ,"nesser@gmail.com","+78823342222", 120000 ,40);
        emp[3] = new Employer("Егоров", "Артем","Вадимович" ,"eart@gmail.com","+78384332222", 250000 ,41);
        emp[4] = new Employer("Никонов", "Григорий","Дмитриевич" ,"nigor@gmail.com","+78833432222", 250000 ,25);
        emp[5] = new Employer("Вершинин", "Алексей","Геннадьевич" ,"verhod@gmail.com","+78883432222", 250000 ,32);
        emp[6] = new Employer("Голубева", "Евгения","Валентиновна" ,"milaev@gmail.com","+76783332222", 55000 ,20);
        emp[7] = new Employer("Тарасова", "Ольга","Алесандровня" ,"taratoon@gmail.com","+78435432222", 140000 ,45);
        emp[8] = new Employer("Никулина", "Анна", "Игоревна","nikanna@gmail.com","+783383432222", 135000 ,32);
        emp[9] = new Employer("Мирошина", "Александра","Петровна" ,"miros@gmail.com","+76453332222", 65000 ,18);

        for (Employer empl : emp) {
           if(empl.age>40) System.out.println(empl.toString());
        }
    }

}
