package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H10_5 extends Applet {

     double cijfers;
    TextField tekstvak;
    Label label;
    String tekst;

    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener( new VakLstener() );
        tekst = "";

        label = new Label("Geef uw gemiddelde cijfer" );

        add( label );
        add( tekstvak );

    }
    public void paint(Graphics g) {
        g.drawString(tekst, 50, 80 );

    }
    class VakLstener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

            String s;
             s = tekstvak.getText();
             cijfers = Double.parseDouble( s );
             if (cijfers > 5.4) {
                 tekst = "U bent geslaagd";
                 repaint();
             }
        }
    }

}
