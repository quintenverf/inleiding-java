package h04;

import java.applet.Applet;
import java.awt.*;

public class h048prakijk extends Applet {

    public void init(){

    }

    public void paint(Graphics g){
        setBackground(Color.black);
        g.setColor(Color.white);
        // lijn
        g.drawString("lijn", 100, 35);
        g.drawLine(20,20,200,20);
        // rechthoek
        g.drawString("rechthoek", 100,115);
        g.drawRect(20,50,200,50);
        //afgeronde rechthoek
        g.drawString("afgeronde rechthoek",75,200);
        g.drawRoundRect(20,130,200,50,20,20);
        //gevulde rechthoek met ovaal
        g.drawString("gevulde rechthoek met ovaal",260,115);
        g.setColor(Color.magenta);
        g.fillRect(250, 50,200,50);
        g.setColor(Color.black);
        g.drawOval(250,50,200,50);
        //gevulde ovaal
        g.setColor(Color.white);
        g.drawString("gevulde ovaal", 300, 200);
        g.setColor(Color.magenta);
        g.fillOval(250, 130,200,50);
        //taartpunt met ovaal
        g.setColor(Color.white);
        g.drawString("taartpunt met ovaal",550,120);
        g.setColor(Color.white);
        g.drawOval(500,50,200,50);
        g.fillOval(500,50,200,50);

        g.drawArc(500,50,200,50,0,45);
        g.setColor(Color.magenta);
        g.fillArc(500,50,200,50,0,45);
        //circle
        g.setColor(Color.white);
        g.drawString("circle", 590,210);
        g.drawOval(580,150,50, 50);
    }
}
