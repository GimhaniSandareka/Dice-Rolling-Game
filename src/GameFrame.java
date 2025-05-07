/*
Sets up the main window (JFrame)
 */

import javax.swing.*;

public class GameFrame extends JFrame {
    public GameFrame() {
        setTitle("Dice Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null); // center the window

        add(new GamePanel());

        setVisible(true);
    }
}
