import javax.swing.*;
import java.awt.*;

public class TableDemo extends JFrame {
    public TableDemo() {
        setTitle("JTable Example");
        
        String[] columnNames = {"ID", "Name", "Age"};
        String[][] data = {
            {"1", "Ram", "21"},
            {"2", "Hari", "22"},
            {"3", "Shyam", "61"}
        };

        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        
        add(scrollPane, BorderLayout.CENTER);
        
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TableDemo();
    }
}