package H13;

import java.applet.Applet;
import java.awt.*;

public class H13_1 extends Applet {

    public void init() {

    }
    public void paint(Graphics g) {

        g.drawString("getekend en wel " , 50, 50);
        tekenDriehoek(g,10,10, 20, 20, 30, 30);

    }
    void tekenDriehoek(Graphics quinten,int x1, int y1, int x2, int y2, int x3, int y3) {
        quinten.drawPolygon(new int[]{100,200,300},new int[]{200,20,200},3);

    }
}
