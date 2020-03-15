package lesson8;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class TicTacToeGame extends JFrame {

    private String SYMB_O = "O";
    private String SYMB_X = "X";
    private int stepCounter = 0;

    private int FIELD_SIZE = 7;
    private int DOTS_TO_WIN = 4;
    private int MAX_STEPS = FIELD_SIZE*FIELD_SIZE;

    private String img_o = "res/O_60.png";
    private String img_x = "res/X_60.png";


    public TicTacToeGame() throws HeadlessException {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Tic Tac Toe");
        try {
            setIconImage(ImageIO.read(new File(img_x)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        setSize(500, 500);
        setLocation(100, 100);

        JPanel panel = new JPanel(new GridLayout(FIELD_SIZE,FIELD_SIZE));
        JButton [][] table = new JButton[FIELD_SIZE][FIELD_SIZE];

        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                table[i][j] = new JButton();
                JButton copy = table[i][j];
                copy.addActionListener(event -> {
                    if (copy.getText().equals("")) {
                        copy.setText(SYMB_X);
                        copy.setIcon(new ImageIcon(img_x));

                        if (isWin(SYMB_X, table, DOTS_TO_WIN)) {

                            StartDialog dialog = new StartDialog();
                            dialog.setResultMessage("Вы победили");
                            this.dispose();
                        }
                        stepCounter++;
                        if (stepCounter == MAX_STEPS) {
                            StartDialog dialog = new StartDialog();
                            dialog.setResultMessage("Ничья");
                            this.dispose();
                        }
                        if(stepCounter < MAX_STEPS) {
                            moveNPC(SYMB_O,table, DOTS_TO_WIN);
                        }
                    }
                });
                panel.add(copy);
            }
        }
        add(panel);
        setVisible(true);
    }

    static final Random rnd = new Random();

    private void moveNPC(String ch,JButton[][] tab, int dotsToWin) {
        while (true) {
            int x = rnd.nextInt(tab.length);
            int y = rnd.nextInt(tab.length);
            if (!tab[x][y].getText().equals(SYMB_X) && !tab[x][y].getText().equals(SYMB_O)) {
                tab[x][y].setIcon(new ImageIcon(img_o));
                tab[x][y].setText(SYMB_O);
                if (isWin(ch, tab, dotsToWin)) {
                    StartDialog dialog = new StartDialog();
                    dialog.setResultMessage("Вы проиграли");
                    this.dispose();
                }
                stepCounter++;
                return;
            }
        }
    }

    private static boolean isWin(String ch, JButton[][] tab, int dotsToWin) {
        for (int i = 0; i < tab.length; i++) {
            int sx = 0, sy = 0, d1 = 0, d2 = 0, d3 = 0;
            for (int j = 0; j < tab.length; j++) {
                if (tab[i][j].getText().equals(ch)){
                    sx += 1;
                } else {
                    sx = 0;
                }
                if (tab[j][i].getText().equals(ch)){
                    sy += 1;
                } else {
                    sy = 0;
                }

                if (tab[j][j].getText().equals(ch)){
                    d1 += 1;
                } else {
                    d1 = 0;
                }

                if (tab[j][tab.length - j - 1].getText().equals(ch)){
                    d2 += 1;
                } else {
                    d2 = 0;
                }

                if (sx == dotsToWin || sy == dotsToWin || d1 == dotsToWin || d2 == dotsToWin) {
                    return true;
                }
            }
        }
// диагонали верх слева вниз направо
        for (int i = 0; i < tab.length; i++) {
            int ddx = 0;
            for (int j = i; j < (tab.length-i); j++){
                if (tab[j][j - i].getText().equals(ch)){
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
                if (tab[j-1][j].getText().equals(ch)){
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
                if (tab[j][tab.length - j ].getText().equals(ch)){
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
                if (tab[j][i-j].getText().equals(ch)){
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

    private void wrapButton(JButton button) {
        button.setSize(100, 100);
    }

    public static void main(String[] args) {
        new StartDialog();
    }
}
