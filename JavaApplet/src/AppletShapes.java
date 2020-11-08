import java.applet.*;
import java.awt.*;

public class AppletShapes extends Applet {
    public void paint(Graphics g) {
        //Line
	g.drawLine(20, 20, 500, 20);
        
        //Rectangle
	g.drawRect(20, 40, 200, 40);
        
        //Square
        g.drawRect(100,100,50,50);
        
        //Oval
	g.drawOval(20, 160, 200, 100);
        
        //Circle
        g.drawOval(60, 270, 100, 100);
        
        //Polygon
        
        // x coordinates of vertices 
        int x[] = { 80, 105, 170, 120 }; 
  
        // y coordinates of vertices 
        int y[] = { 400, 425, 439, 470 }; 
  
        // number of vertices 
        int numberofpoints = 4; 
  
        // draw the polygon using drawPolygon function 
        g.drawPolygon(x, y, numberofpoints); 
    }
    
}
