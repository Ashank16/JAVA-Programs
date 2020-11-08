import java.awt.*;
import java.applet.Applet;

public class AppletNumerical extends Applet {
    
    public void paint (Graphics g) {
        int x = 16;
        int y = 30;
        int add = x + y;
        String s = "Add : " + String.valueOf(add);
        g.drawString(s, 100, 100);
    }
    
}
