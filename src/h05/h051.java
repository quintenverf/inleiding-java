package h05;

import java.applet.Applet;
import java.awt.*;

public class h051 extends Applet {

    int width, hight1, hight2,r1,r2,r3;
    Color Kleur;

    public void init(){
        // what gives them growth and shape
        width = 200;
        hight1 = 50;
        hight2 = 50;
        //rows
        r1 = 20;
        r2 = 250;
        r3 = 500;
        //color
        Kleur = Color.pink;


    }

    public void paint(Graphics g){

        setBackground(Color.black);
        g.setColor(Color.white);
        // lijn
        g.drawString("lijn", 100, 35);
        g.drawLine(r1,20,width,20);
        // rechthoek
        g.drawString("rechthoek", 100,115);
        g.drawRect(r1,hight1,width, hight2);
        //afgeronde rechthoek
        g.drawString("afgeronde rechthoek",75,200);
        g.drawRoundRect(20,130,width, hight2,20,20);
        //gevulde rechthoek met ovaal
        g.drawString("gevulde rechthoek met ovaal",260,115);
        g.setColor(Kleur);
        g.fillRect(r2, hight1,width, hight2);
        g.setColor(Color.black);
        g.drawOval(r2,hight1,width, hight2);
        //gevulde ovaal
        g.setColor(Color.white);
        g.drawString("gevulde ovaal", 300, 200);
        g.setColor(Kleur);
        g.fillOval(r2, 130,width, hight2);
        //taartpunt met ovaal
        g.setColor(Color.white);
        g.drawString("taartpunt met ovaal",550,120);
        g.setColor(Color.white);
        g.drawOval(r3,hight1,width, hight2);
        g.fillOval(r3,hight1,width, hight2);

        g.drawArc(r3,hight1,width, hight2,0,45);
        g.setColor(Kleur);
        g.fillArc(r3,hight1,width, hight2,0,45);
        //circle
        g.setColor(Color.white);
        g.drawString("circle", 590,210);
        g.drawOval(580,150,50, hight2);

    }

}
