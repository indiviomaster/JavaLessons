package Lesson7;

public class FeedTheCat {
    public static void main(String[] args) {

        PlateOfFood thePlate = new PlateOfFood(800);

        HungryCat [] cats = new HungryCat[10];
        for (int i=0; i<cats.length; i++){
            cats[i] = new HungryCat("Tom "+i, 150);
        }
        for (int i=0; i<cats.length; i++){
            cats[i].Feed(thePlate);
        }
        for (int i=0; i<cats.length; i++){
            System.out.println("Кот " + cats[i].getName() +" "+ (cats[i].isFullness()?" сыт.":"голоден."));
        }
        System.out.println(thePlate.toString());
        thePlate.addFood(1500);
        System.out.println(thePlate.toString());
    }
}
