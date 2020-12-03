import java.awt.*;
import java.applet.Applet;

public class AppletNumerical extends Applet {
    
    public void paint (Graphics g) {
        int x = 12;
        int y = 24;
        int add = x + y;
        String s = "Add : " + String.valueOf(add);
        g.drawString(s, 100, 100);
    }
    
}
