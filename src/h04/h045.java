package h04;

import java.applet.Applet;
import java.awt.*;

public class h045 extends Applet {

    public void init(){

    }

    public void paint(Graphics g){
        //achtergrond
        setBackground(Color.black);
        //oval
        g.drawOval(20,20,100,50);
        g.setColor(Color.blue);
        g.fillOval(20,20,100,50);
        //arc
        g.drawArc(20,20,100,50,90,45);
        g.setColor(Color.yellow);
        g.fillArc(20,20,100,50,90,45);

    }


}
