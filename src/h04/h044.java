package h04;

import java.applet.Applet;
import java.awt.*;

public class h044 extends Applet {

    public void init(){

    }

    public void paint(Graphics g){
        setBackground(Color.black);
        g.setColor(Color.white);
        //the box
        g.drawLine(60,60,60,250);
        g.drawLine(250,250,60,250);
        ////kg x 2
        ///250 - hight - 1 = answer
        /// x + width + 1/2 = answer
        //valerie 100 kg
        g.setColor(Color.pink);
        g.fillRect(62,169,40,80);
        g.drawString("valerie", 61,270);
        //jeroen 100 kg
        g.setColor(Color.lightGray);
        g.fillRect(103,49,40,200);
        g.drawString("jeroen", 103,270);
        //hans 80 kg
        g.setColor(Color.green);
        g.fillRect(145,89,40,160);
        g.drawString("hans", 145,270);

    }
}
