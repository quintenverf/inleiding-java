package h04;

import java.applet.Applet;
import java.awt.*;

public class h043 extends Applet {

    public void init(){

    }
    public void paint(Graphics g){
        setBackground(Color.black);
        g.setColor(Color.white);
        //pole
        g.drawRect(50,50,10,200);
        g.drawRoundRect(50,50,10,5,10,10);
        g.drawRoundRect(50,245,10,5,10,10);
        //stone
        g.drawRect(20,250,200,30);
        //flag
        ////red
        g.setColor(Color.red);
        g.fillRect(62,60, 70, 15);
        ////white
        g.setColor(Color.white);
        g.fillRect(62,75, 70, 15);
        ////bleu
        g.setColor(Color.blue);
        g.fillRect(62,90, 70, 15);
        // alles kan mooier maar ik begrijp het en daar gaat het volgensmij om.


    }

}
