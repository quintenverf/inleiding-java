package h04;

import java.applet.Applet;
import java.awt.*;

public class h047 extends Applet {

    public void init(){

    }

    public void paint(Graphics g){
        setBackground(Color.black);
        g.setColor(Color.white);

        g.drawRoundRect(60,60, 200,200,90,90);

        g.fillRoundRect(60,60, 200,200,90,90);
        g.setColor(Color.black);
        g.fillOval(90,100,50,50);
        g.fillOval(90,170,50,50);
        g.fillOval(180,100,50,50);
        g.fillOval(180,170,50,50);

    }
}

