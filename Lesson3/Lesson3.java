package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    /*Написать программу, которая загадывает случайное число  от 0 до 9, и пользователю дается 3 попытки угадать это
    число. При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное,
    или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз?
    1 – да / 0 – нет»(1 – повторить, 0 – нет).*/
    static void digInput() {

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Random rndDig = new Random();
        int rndInt;
        int dig;
        boolean gameOn = true;
        boolean gameRepeat = true;

        while(gameRepeat) {
            gameRepeat = false;
            gameOn = true;
            rndInt = rndDig.nextInt(10);
            while (gameOn) {
                gameOn = false;
                System.out.println("ВВЕДИТЕ ЧИСЛО ОТ 0 ДО 9");
                dig = in.nextInt();
                if (rndInt > dig) {
                    System.out.println("задуманное число больше введеного");
                    System.out.println("Продолжим угадывать? (1 - да, 0 - нет):");
                    if(in.nextInt()==1) gameOn = true;
                } else if (rndInt < dig) {
                    System.out.println("задуманное число меньше введеного");
                    System.out.println("Продолжим угадывать? (1 - да, 0 - нет):");
                    if(in.nextInt()==1) gameOn = true;
                } else {
                    gameOn = false;
                    System.out.println("Вы выиграли");
                }

            }

            System.out.println("Повторить игру еще раз? (1 - да, 0 - нет):");
            if(in.nextInt()==1) gameRepeat = true;
        }
        in.close();
    }
}
