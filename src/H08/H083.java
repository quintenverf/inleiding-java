package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H083 extends Applet {

    Button OKknop;
    TextField Textvak;
    Label label;
    double getal;
    double uitkomst;
    double btw;

    public void init() {
        // to press when done
        OKknop = new Button(" OK ");
        add(OKknop);
        Textvak = new TextField("", 30);
        add(Textvak);
        label = new Label("typ uw bedrag" + "en druk op enter");
        add(label);
        // aansluiters
        Textvak.addActionListener(new Textvaklistener());
       // OKknop.addActionListener(new OKknoplistener());
        uitkomst = 0.0;

    }

    public void paint(Graphics g) {
        g.drawString("btw bedrag" + uitkomst, 100, 100);
    }

    class Textvaklistener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            getal = Double.parseDouble(Textvak.getText());
            btw = (getal /100) *21;
            uitkomst = getal + btw;
            repaint();

        }

//        class OKknoplistener implements ActionListener {
//
//            public void actionPerformed(ActionEvent e) {
//
//                repaint();
//
//            }
//        }
     }

     // TODO alleen de OK knop werkt niet maar daar kom ik nog wel op terug
}
