package Lesson6;

import java.util.Random;

public class Dog extends Animal {
    Random rndDig = new Random();
    double runDistance = rndDig.nextInt(6)*100;
    double swimDistance = rndDig.nextInt(5)*10;
    double jumpHeight = rndDig.nextInt(10)*0.1+0.2;

    @Override
    public boolean run(double distance) {
     if (distance > 0 && distance <= runDistance){
         return true;
     }   else{
         return false;
     }
    }

    @Override
    public boolean swim(double distance) {
        if (distance > 0 && distance <= swimDistance){
            return true;
        }   else{
            return false;
        }
    }

    @Override
    public boolean jump(double height) {
        if (height > 0 && height <= jumpHeight){
            return true;
        }   else{
            return false;
        }
    }
}
