import java.util.Random;
import java.util.Scanner;

public class Game {

  private static final char DOT_X = 'X';
  private static int stepCounter = 0;
  private static final char DOT_O = 'O';
  private static final char DEFAULT = '_';
  public static final int DOTS_TO_WIN = 4;
  private static final Random rnd = new Random();

  public static void main(String[] args) throws InterruptedException {
    Scanner in = new Scanner(System.in);
    System.out.println("Введите размер поля");
    int size = in.nextInt();
    char[][] tab = new char[size][size];
    initTable(tab);
    boolean isInGame = true;
    while (isInGame) {
      System.out.println("Введите номер строки и номер столбца для хода");
      print(tab);
      int x = in.nextInt()-1;
      int y = in.nextInt()-1;

      if  (isValidStep(x, y, tab)) {
        tab[x][y] = DOT_X;
        if (isWin(DOT_X, tab, DOTS_TO_WIN)) {
          print(tab);
          System.out.println("Вы победили");
          return;
        }
        stepCounter++;
        if (stepCounter == size * size) {
          print(tab);
          System.out.println("Ничья");
          return;
        }
        turnNPC(DOT_O, tab, DOTS_TO_WIN);

        System.out.println();
        if (isWin(DOT_O, tab, DOTS_TO_WIN)) {
          print(tab);
          System.out.println("Вы проиграли");
          return;
        }
      }
    }
  }

  private static boolean isWin(char ch, char[][] tab, int dotsToWin) {
    for (int i = 0; i < tab.length; i++) {
      int sx = 0, sy = 0, d1 = 0, d2 = 0, d3 = 0;
      for (int j = 0; j < tab.length; j++) {
          if (tab[i][j] == ch){
              sx += 1;
          } else {
              sx = 0;
          }
          if (tab[j][i] == ch){ sy += 1;
          } else {
              sy = 0;
          }

          if (tab[j][j] == ch){
              d1 += 1;
          } else {
              d1 = 0;
          }

          if (tab[j][tab.length - j - 1] == ch){
              d2 += 1;
          } else {
              d2 = 0;
          }

          if (sy == dotsToWin || sy == dotsToWin || d1 == dotsToWin || d2 == dotsToWin) {
              return true;
          }
      }
    }

     for (int i = 0; i < tab.length; i++) {
         int ddx = 0;
         for (int j = i; j < (tab.length-i); j++){
             if (tab[j][j - i] == ch){
                 ddx += 1;
             } else {
                 ddx = 0;
             }
         }
         if (ddx == dotsToWin) {
             return true;
         }
     }

      for (int i = 0; i < tab.length; i++) {
          int ddx1 = 0;
          for (int j = i+1; j < (tab.length-i-1); j++){
              if (tab[j-1][j] == ch){
                  ddx1 += 1;
                  if (ddx1 == dotsToWin) {
                      return true;
                  }
              } else {
                  ddx1 = 0;
              }

          }

      }
// диагонали верх справа вниз налево
      for (int i = 1; i < tab.length; i++) {
          int ddy1 = 0;
          for (int j = i; j < (tab.length-i); j++){
              if (tab[j][tab.length - j ] == ch){
                  ddy1 += 1;
                  if (ddy1 == dotsToWin) {
                      return true;
                  }
              } else {
                  ddy1 = 0;
              }

          }

      }

      for (int i = 1; i < tab.length-1; i++) {
          int ddy2 = 0;
          for (int j = 0; j<=i; j++){
              if (tab[j][i-j] == ch){
                  ddy2 += 1;
                  if (ddy2 == dotsToWin) {
                      return true;
                  }
              } else {
                  ddy2 = 0;
              }

          }

      }


    return false;
  }

  private static void turnNPC(char ch, char[][] tab, int dotsToWin) {
    while (true) {
      int x = rnd.nextInt(tab.length), y = rnd.nextInt(tab.length);
      if (isValidStep(x, y, tab)) {
        tab[x][y] = DOT_O;
        stepCounter++;
        return;
      }
    }
  }

  private static boolean isValidStep(int x, int y, char[][] tab) {
    int size = tab.length;
    if (x >= 0 && x < size && y >= 0 && y < size) {
      return tab[x][y] == DEFAULT;
    }
    return false;
  }


  private static void print(char[][] tab) {
    System.out.print("   ");
    for (int i = 0; i < tab.length; i++) {
      System.out.print((i + 1) + " ");
    }
    System.out.println();
    for (int i = 0; i < tab.length; i++) {
      System.out.print((i + 1) + " ");
      for (int j = 0; j < tab.length; j++) {
        System.out.print("|" + tab[i][j]);
      }
      System.out.println("|");
    }
  }

  private static void initTable(char[][] tab) {
    for (int i = 0; i < tab.length; i++) {
      for (int j = 0; j < tab.length; j++) {
        tab[i][j] = DEFAULT;
      }
    }
  }
}