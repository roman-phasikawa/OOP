import javax.swing.*;
import java.awt.*;

public class LayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Layout Demo");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Setting GridLayout with 2 rows and 1 columns
        frame.setLayout(new GridLayout(2, 1));

        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));

        frame.setVisible(true);
    }
}