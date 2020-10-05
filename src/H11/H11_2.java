package H11;

import java.applet.Applet;
import java.awt.*;

public class H11_2 extends Applet {

    public void init() {

    }
    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.white);
        g.drawString("20, ",10,20);
        g.drawString(" 19, ", 30,20);
        g.drawString(" 18, ", 50,20);
        g.drawString(" 17, ", 70,20);
        g.drawString(" 16, ", 90,20);
        g.drawString(" 15, ", 110,20);
        g.drawString(" 14, ", 130,20);
        g.drawString(" 13, ", 150,20);
        g.drawString(" 12, ", 170,20);
        g.drawString(" 11, ", 190,20);
        g.drawString(" 10, ", 210,20);
    }
}
