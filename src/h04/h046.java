package h04;

import java.applet.Applet;
import java.awt.*;

public class h046 extends Applet {

    public void init(){

    }

    public void paint(Graphics g){
       setBackground(Color.black);
       g.setColor(Color.white);
        //pole
        g.setColor(Color.white);
        g.drawRoundRect(95,250,10,150,10, 10);
        //board
        g.drawRoundRect(60,60, 80,200,90,90);
        g.setColor(Color.black);
        g.fillRoundRect(62,64, 75,195,90,90);
        // lamps
        //red
        g.setColor(Color.red);
        g.fillOval(80,80,40,40);
        //yellow
        g.setColor(Color.yellow);
        g.fillOval(80,140,40,40);
        //green
        g.setColor(Color.green);
        g.fillOval(80,200,40,40);
        //pole
        //g.setColor(Color.white);
        //g.drawRoundRect(95,250,10,150,10, 10);

    }
}
