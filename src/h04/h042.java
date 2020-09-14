package h04;


import java.applet.Applet;
import java.awt.*;

public class h042 extends Applet {


    public void init(){

    }

    public void paint(Graphics g){
        setBackground(Color.black);
        g.setColor(Color.white);
        //the house
        g.drawRect( 150,150,120,120);
        //the roof
        g.drawLine(150,150, 220, 60);
        g.drawLine(270,150,220,60);
        //the window
        g.drawRect(175, 175,30,30);
        //the door
        g.drawRect(220,230,20,40);

    }
}
