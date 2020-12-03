import java.awt.FlowLayout;  
import javax.swing.*;

public class JFrameExample {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Window Frame");  
        JPanel panel = new JPanel();  
        panel.setLayout(new FlowLayout());  
        JLabel label = new JLabel("Ashank Juyal        45-IT-18        ");  
        JButton button = new JButton();  
        button.setText("Click here");  
        panel.add(label);  
        panel.add(button);  
        frame.add(panel);  
        frame.setSize(200, 300);  
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);
    }
    
}
