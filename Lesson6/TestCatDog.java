package Lesson6;

public class TestCatDog {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog dog2 = new Dog();
        Cat cat = new Cat();

        System.out.println( "dog jump:" + dog.jump(0.1));
        System.out.println( "dog swim:" + dog.swim(600));
        System.out.println( "dog run:" + dog.run(50));
        System.out.println( "cat jump:" + dog.jump(0.1));
        System.out.println( "cat swim:" + dog.swim(1));
        System.out.println( "cat run:" + dog.run(50));
    }
}
