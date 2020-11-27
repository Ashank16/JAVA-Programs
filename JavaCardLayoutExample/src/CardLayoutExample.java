import java.awt.*;  
import java.awt.event.*;    
import javax.swing.*;  
  
public class CardLayoutExample extends JFrame implements ActionListener {  
    CardLayout card;  
    JButton b1,b2,b3;  
    Container c;  
    
    CardLayoutExample() {
        c = getContentPane();
        
        //create CardLayout object with 40 horizontal space and 30 vertical space
        card = new CardLayout(40,30);        
          
        c.setLayout(card);  
          
        b1 = new JButton("Ashank");  
        b2 = new JButton("Juyal");  
        b3 = new JButton("45-IT-18");
        
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        b3.addActionListener(this);      
              
        c.add("a",b1);
        c.add("b",b2);
        c.add("c",b3);   
    }
    
    public void actionPerformed(ActionEvent e) {  
        card.next(c);  
    }  
  
    public static void main(String[] args) {  
        CardLayoutExample cl = new CardLayoutExample();  
        cl.setSize(400,400);  
        cl.setVisible(true);  
        cl.setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }  
}
