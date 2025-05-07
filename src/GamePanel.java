import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GamePanel extends JPanel {
    private JLabel diceLabel1, diceLabel2, resultLabel;
    private JButton rollButton;
    private Random random;

    public GamePanel() {
        setLayout(new GridLayout(4, 1));

        random = new Random();

        diceLabel1 = new JLabel("Dice 1: ", SwingConstants.CENTER);
        diceLabel2 = new JLabel("Dice 2: ", SwingConstants.CENTER);
        resultLabel = new JLabel("Click 'Roll Dice' to play!", SwingConstants.CENTER);

        rollButton = new JButton("Roll Dice");
        rollButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rollDice();
            }
        });

        add(diceLabel1);
        add(diceLabel2);
        add(resultLabel);
        add(rollButton);
    }

    private void rollDice() {
        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;
        int total = dice1 + dice2;

        diceLabel1.setText("Dice 1: " + dice1);
        diceLabel2.setText("Dice 2: " + dice2);

        if (total == 7 || total == 11) {
            resultLabel.setText("You Win!\n Total = " + total);
        } else {
            resultLabel.setText("You Lose!\n Total = " + total);
        }
    }
}
