import java.awt.*;  
import javax.swing.JFrame;

public class MenuExample {
    MenuExample() {  
        JFrame f = new JFrame("Menu, MenuItem and Submenus Example");  
        MenuBar mb = new MenuBar();  
        Menu menu = new Menu("Menu");  
        Menu submenu = new Menu("Sub Menu");  
        MenuItem i1 = new MenuItem("Item 1");  
        MenuItem i2 = new MenuItem("Item 2");  
        MenuItem i3 = new MenuItem("Item 3");  
        MenuItem i4 = new MenuItem("Item 4");  
        menu.add(i1);  
        menu.add(i2);  
        submenu.add(i3);  
        submenu.add(i4);  
        menu.add(submenu);  
        mb.add(menu);  
        f.setMenuBar(mb);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);
    }  
    
    public static void main(String args[]) {
        new MenuExample();  
    }  
}
