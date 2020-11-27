import java.awt.*;
import javax.swing.*;

public class GridLayoutTest {
    GridLayoutTest() {
        JFrame frame = new JFrame("GridLayout Test");
        JButton button1, button2, button3, button4;
        button1 = new JButton("Ashank");
        button2 = new JButton("Juyal");
        button3 = new JButton("45-IT-18");
        button4 = new JButton("BPIT");
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.setLayout(new GridLayout(2,2));
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        new GridLayoutTest();
    }
}
