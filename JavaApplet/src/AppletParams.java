import java.awt.*;
import java.applet.*;
/*<applet code="AppletParams" width="300" height="300"><param name="msg" value="Welcome to applet"></applet>*/       

public class AppletParams extends Applet {
    public void paint(Graphics g){  
        String str = this.getParameter("msg");  
        g.drawString(str, 100, 80);  
    }
}
