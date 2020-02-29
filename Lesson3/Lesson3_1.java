package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Lesson3_1 {

  /*  Создать массив из слов String[] words = {"apple",
            "orange", "lemon", "banana", "apricot", "avocado",
            "broccoli", "carrot", "cherry", "garlic", "grape",
            "melon", "leak", "kiwi", "mango", "mushroom", "nut",
            "olive", "pea", "peanut", "pear", "pepper", "pineapple",
            "pumpkin", "potato"};
    При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с загаданным словом и сообщает правильно
    ли ответил пользователь. Если слово не угадано, компьютер показывает буквы которые стоят на своих  местах.
            apple – загаданное
            apricot - ответ игрока
    ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
    Для сравнения двух слов посимвольно, можно пользоваться:
    String str = "apple";
    str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
    Играем до тех пор, пока игрок не отгадает слово используем только маленькие буквы*/

    public static void main(String[] args) {
        String [] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape",
                "melon", "leak", "kiwi", "mango", "mushroom", "nut",
                "olive", "pea", "peanut", "pear", "pepper", "pineapple",
                "pumpkin", "potato"};
        String ansWord;
        Random rndDig = new Random();
        String quizWord = words[rndDig.nextInt(words.length)];
        Scanner in = new Scanner(System.in);
        char [] quizz = new char[15];
        for (int i=0; i<quizz.length;i++){
            quizz[i]='#';
        }
        char sym;

        boolean gameOn = true;
        while(gameOn) {
            System.out.println("Введите слово:");
            ansWord = in.next();
            if (!ansWord.equals(quizWord)) {
                for (int i = 0; i < ansWord.length(); i++) {
                    sym = ansWord.charAt(i);
                    System.out.println(sym);
                    for (int j = 0; j < quizWord.length(); j++) {
                        if (quizWord.charAt(j) == ansWord.charAt(i)) {
                            quizz[j] = ansWord.charAt(i);
                        }
                    }
                }

                for (int i = 0; i < quizz.length; i++) {
                    System.out.print(quizz[i]);
                }
                System.out.println();


            } else {
                System.out.println("Вы выиграли");
                gameOn = false;
            }
        }
        in.close();
    }
}
