package H13;

import java.applet.Applet;
import java.awt.*;

public class H13_praktijk extends Applet {
    int xRect = 500;
    int yRect = 300;
    int widthRect = 60;
    int heightRect = 200;

    int xOval = 430;
    int yOval = 200;
    int widthOval = 200;
    int heightOval = 200;

    public void init() {
        setSize(1000,500);

    }
    public void paint(Graphics g) {
        tekenBoom(g, 1, 2, 3);
    }
    public void tekenBoom(Graphics quinten, int x1, int y2, int x2){
        for (int tellervertical = 0; tellervertical < 2; tellervertical++) {
            for (int tellerhorizontal = 0; tellerhorizontal < 5; tellerhorizontal++) {

                quinten.setColor(new Color(135, 118, 70));
                quinten.fillRect(xRect, yRect, widthRect, heightRect);
                xRect += widthRect;
                quinten.setColor(new Color(93, 143, 106));
                quinten.fillOval(xOval, yOval, widthOval, heightOval);
                xOval += widthOval;
            }
            yRect += 300;
            xRect = 0;
            yOval += 300;
            xOval = 0;
        }
    }
}
