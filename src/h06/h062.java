package h06;

import java.applet.Applet;
import java.awt.*;

public class h062  extends Applet {
    int seconds;
    double uur, dag, jaar;

    public void init(){
        // 60 second for 1 minute and build it from there
        seconds = 60;
        uur = 60 * 60;
        dag = uur * 24;
        jaar = dag * 365;
    }

    public void paint (Graphics g){
        setBackground(Color.black);
        g.setColor(Color.white);

        g.drawString("seconds", 30, 20);
        g.drawString("uur " + uur , 30,40);
        g.drawString("dag " + dag , 30, 60);
        g.drawString("jaar " + jaar, 30, 80);

    }
}
