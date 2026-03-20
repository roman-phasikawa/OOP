import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiplierApp extends JFrame {
    private JTextField txtNum1, txtNum2, txtResult;
    private JButton btnOk, btnExit;

    public MultiplierApp() {
        // Window Setup
        setTitle("Multiplication App");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new java.awt.Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Components
        txtNum1 = new JTextField(10);
        txtNum2 = new JTextField(10);
        txtResult = new JTextField(10);
        txtResult.setEditable(false); // Make result field read-only

        btnOk = new JButton("OK");
        btnExit = new JButton("Exit");

        // Layout arrangement
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("First Number:"), gbc);
        gbc.gridx = 1;
        add(txtNum1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Second Number:"), gbc);
        gbc.gridx = 1;
        add(txtNum2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(new JLabel("Result:"), gbc);
        gbc.gridx = 1;
        add(txtResult, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(btnOk, gbc);
        gbc.gridx = 1;
        add(btnExit, gbc);

        // OK Button Logic
        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double n1 = Double.parseDouble(txtNum1.getText());
                    double n2 = Double.parseDouble(txtNum2.getText());
                    double product = n1 * n2;
                    txtResult.setText(String.valueOf(product));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter valid numbers!");
                }
            }
        });

        // Exit Button Logic
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
        setLocationRelativeTo(null); // Center the window
    }

    public static void main(String[] args) {
        // Run UI on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> new MultiplierApp());
    }
}