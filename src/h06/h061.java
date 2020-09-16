package h06;

import java.applet.Applet;
import java.awt.*;

public class h061 extends Applet {
    double jan, ali, jeanette, ik, a, uitkomst;

    public void init(){
        a = 113;
        jan = 1;
        ali = 1;
        jeanette = 1;
        ik  = 1;
        uitkomst = a / (jan + ali + jeanette + ik);
    }


    public void paint(Graphics g){
        setBackground(Color.black);
        g.setColor(Color.white);
        g.drawString("omzet 113,- " , 20, 10);
        g.drawString("verdeeld/ winst", 30, 40);
        g.drawString("jan " + uitkomst, 30, 60);
        g.drawString("ali " + uitkomst,30,80);
        g.drawString("jeanette " + uitkomst, 30,100);
        g.drawString("ik " + uitkomst, 30, 120);

    }
}
