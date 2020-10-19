package H13;

import java.applet.Applet;
import java.awt.*;

public class H13_1 extends Applet {
    double gem;


    public void init() {
        int x1 = 10;
        int y1 = 20;
        int x2 = 10;
        int y2 = 20;
        int x3 = 10;
        int y3 = 20;
        tekenDriehoek( x1,y1, x2, y2, x3, y3);
    }
    public void paint(Graphics g) {
    g.drawString("getekend en wel " + gem, 50, 50);
    }
    void tekenDriehoek( int x1, int y1, int x2, int y2, int x3, int y3) {
        
    }
}
