package h05;

import java.applet.Applet;
import java.awt.*;

public class h052 extends Applet {

    int weight, height;
    int valerie, jeroen, hans;

    public void init(){
        // fill in your weight
        valerie = 40 * 2;
        jeroen = 100 * 2;
        hans = 80 * 2;

//        height = weight * 2;

    }

    public void paint(Graphics g){
        setBackground(Color.black);
        g.setColor(Color.white);
        //the box
        g.drawLine(60,60,60,250);
        g.drawLine(250,60,60,60);
        ////kg x 2
        ///250 - hight - 1 = answer
        /// x + width + 1/2 = answer
        //valerie 40 kg
        g.drawString("0 kg", 30, 70);
        g.setColor(Color.pink);
        g.fillRect(62,62,40,valerie);
        g.drawString("valerie", 61,50);
        //jeroen 100 kg
        g.setColor(Color.lightGray);
        g.fillRect(103,62,40,jeroen);
        g.drawString("jeroen", 103,50);
        //hans 80 kg
        g.setColor(Color.green);
        g.fillRect(145,62,40,hans);
        g.drawString("hans", 145,50);

    }
}
