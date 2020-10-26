package H14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H14_1 extends Applet {
    double r;
    int shuffle;
    String  tekst;
    Button knop = new Button();
    boolean clicked;


    public void init() {
        clicked = false;
        add(knop);
        knop.addActionListener(new KnopListener());

    }

    public void paint(Graphics g) {
       g.drawString( "" + tekst, 50, 50);
        knop.setSize(50, 20);
        if (clicked == true) {
            r = Math.random();
            shuffle = (int) (r * 14 + 2);
            switch (shuffle) {
                case 11:
                    tekst = "jack";
                    break;
                case 12:
                    tekst = "queen";
                    break;
                case 13:
                    tekst = "king";
                    break;
                case 14:
                    tekst = "ace";
                    break;
                default:
                    tekst = "" + shuffle;

            }

        }


    }
        class KnopListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                clicked = true;
                repaint();
            }
        }
    }

