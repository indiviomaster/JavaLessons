package lesson8;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class StartDialog extends JFrame {

    private JLabel result;
    private String img_x = "res/X_60.png";

    public void setResultMessage(String message) {
        result.setText(message);
    }

    public StartDialog() throws HeadlessException {
        setTitle("Tic Tac Toe");
        try {
            setIconImage(ImageIO.read(new File(img_x)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        setLocation(100, 100);
        setSize(300, 80);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        result = new JLabel();
        JButton gameBtn = new JButton("Играть"),
                closeBtn = new JButton("Выход");
        gameBtn.addActionListener(ev -> {
            new TicTacToeGame();
            dispose();
        });
        closeBtn.addActionListener(ev -> {
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            dispose();

        });
        JPanel panel = new JPanel();
        panel.add(result);
        panel.add(gameBtn);
        panel.add(closeBtn);
        add(panel);
        setVisible(true);
    }
}
