import javax.swing.*;
import java.awt.*;

public class AppletDemo extends JPanel {

    // 1. Your original methods (Modified slightly for Swing)
    public void init() {
        System.out.println("Applet initialized");
    }

    public void start() {
        System.out.println("Applet started");
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        System.out.println("Applet paint");
        g.drawString("Applet Lifecycle Demo", 20, 20);
    }

    // 2. The missing "Engine" to make it run
    public static void main(String[] args) {
        JFrame frame = new JFrame("Applet Lifecycle Demo");
        AppletDemo panel = new AppletDemo();

        // Manually calling your lifecycle methods to show how they work
        panel.init();
        panel.start();

        frame.add(panel);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}