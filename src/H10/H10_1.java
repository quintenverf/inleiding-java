package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H10_1 extends Applet {

    TextField tekstvak;
    Label label;
    String tekst;
    double getal;

    public void init() {
        tekstvak = new TextField(10);
        add(tekstvak);
        tekstvak.addActionListener(new Tekstvak() );

        label = new Label();
        add(label);

        getal = 0.0;


    }

    public void paint(Graphics g) {
//        g.drawString(""+ 8 + " is groter dan " + 5 + " : " + (8>5), 50,60);
//        g.drawString(""+ 8 + " is kleiner dan " + 5 + " : " + (8<5), 50,80);
        label.setLocation(40,40);

        g.drawString("antwoord " + getal, 40,60);


    }
    class Tekstvak implements ActionListener{

        public void actionPerformed(ActionEvent e) {


        }
    }
}
