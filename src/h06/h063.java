package h06;

import java.applet.Applet;
import java.awt.*;

public class h063 extends Applet {
    int uitkomst, a, b;
    int ab1, ab2, ab3;
    public void init(){
        a = 2;
        b = 4;
        uitkomst = a - b ;
        ab1 = uitkomst + (-b);
        ab2 = (-ab1) + a / a ;



    }

    public void paint(Graphics g){
        setBackground(Color.black);
        g.setColor(Color.white);

        g.drawString("uitkomst " + uitkomst, 30, 30);
        g.drawString("ab1 " + ab1,30,60);
        g.drawString("ab2 " + ab2,30,90);
        g.drawString("ab3 " + ab3,30,120);
        // ik snap niet hoe je 2 positieve waardes tot een negatiev resultaat kan brengen,
        // dus ik laat het maar zoals het is en vraag er wel een keer naar.
    }
}
