package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class H10_praktijk extends Applet {

    TextField tekstvak;
    Label label;
    String s, tekst;
    int dag;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type je afgeronde cijfer in ");
        tekstvak.addActionListener( new TekstvakListenerr() );
        tekst = "";
        add(label);
        add(tekstvak);

    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 80 );

    }
    class TekstvakListenerr implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            dag = Integer.parseInt( s);
            switch(dag) {
                case 1:
                    tekst = "slecht ";
                    break;
                case 2:
                    tekst = "slecht ";
                    break;
                case 3:
                    tekst = "slecht ";
                    break;
                case 4:
                    tekst = "matig ";
                    break;
                case 5:
                    tekst = "onvoldoende ";
                    break;
                case 6:
                    tekst = "voldoende ";
                    break;
                case 7:
                    tekst = "voldoende ";
                    break;
                case 8:
                    tekst = "goed ";
                    break;
                case 9:
                    tekst = "goed ";
                    break;
                case 10:
                    tekst = "JIJ bent echt een topper 'GOED'";
                    break;
                case 11:
                    tekst = " HEY! niet leuk doen, ik zei t/m 10";
                    break;
                case 12:
                    tekst = " stop alsjeblieft ;(";
                    break;
                default:
                    tekst = "dit klopt niet, hou het tussen 1 en 10..!";
                    break;
            }
            repaint();
        }
    }
}
