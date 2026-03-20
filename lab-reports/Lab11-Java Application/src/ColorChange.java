import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChange {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Changer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // We create the panel
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JButton redButton = new JButton("Red");
        JButton greenButton = new JButton("Green");

        // Action listener for Red Button - Targeting the PANEL
        redButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.RED);
            }
        });

        // Action listener for Green Button - Targeting the PANEL
        greenButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.GREEN);
            }
        });

        panel.add(redButton);
        panel.add(greenButton);
        
        frame.add(panel);
        frame.setVisible(true);
    }
}