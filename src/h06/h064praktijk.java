package h06;

import java.applet.Applet;
import java.awt.*;

public class h064praktijk extends Applet {
    double a,b,c;
    double uitkomst, uitkomst1, uitkomst2,uitkomst3;
    int uitkomst4 ;
    double u5;

    public void init(){

        a = 59;
        b = 63;
        c = 69;

        uitkomst = a + b + c;
        uitkomst1 = uitkomst / 3;
        uitkomst2 = uitkomst1 / 10;
        uitkomst3 = 6.3666666 * 10;
        uitkomst4 = 63;
        u5 = 63/10;
        // hij word steeds afgerond en ik weet niet waarom want hij staat in een double maar gedraagr zich als een int.

    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.white);

        g.drawString("uitkomst " + u5, 30, 30);


    }
}
