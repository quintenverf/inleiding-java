package h04;

import java.applet.Applet;
import java.awt.*;

public class h041 extends Applet {

    public void init(){

    }

    public void paint(Graphics g){
        setBackground(Color.black);
        g.setColor(Color.white);
        //bottom
        g.drawLine(160,200, 260, 200);
        //left
        g.drawLine(160,200, 210, 60);
        //right
        g.drawLine(260,200, 210, 60);




    }

}
