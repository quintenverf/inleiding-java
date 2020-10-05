package H11;

import java.applet.Applet;
import java.awt.*;

public class H11_4 extends Applet {

    public void init() {

    }
    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.white);
        g.drawString("1x3 = 3, ",10,20);
        g.drawString("2x3 = 6, ",10,40);
        g.drawString("3x3 = 9, ",10,60);
        g.drawString("4x3 = 12, ",10,80);
        g.drawString("5x3 = 15, ",10,100);
        g.drawString("6x3 = 18, ",10,120);
        g.drawString("7x3 = 21, ",10,140);
        g.drawString("8x3 = 24, ",10,160);
        g.drawString("9x3 = 27, ",10,180);
        g.drawString("10x3 = 30, ",10,200);
    }
}
