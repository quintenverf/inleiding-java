package H14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H14_1 extends Applet {
    double r;
    int shuffle;
    String  tekst, tekst2;
    Button knop = new Button("deel kaart");
    boolean clicked;


    public void init() {
        clicked = false;
        add(knop);
        knop.addActionListener(new KnopListener());
    }
    public void paint(Graphics g) {
       g.drawString( "" + tekst, 100, 50);
        knop.setSize(100, 20);
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
        g.drawString("" + tekst2, 50,50);
        if (clicked == true){
            r = Math.random();
            shuffle = (int) (r * 4);
            switch (shuffle){
                case 1:
                    tekst2 = "spades";
                    break;
                case 2:
                    tekst2 = "clubs";
                    break;
                case 3:
                    tekst2 = "hearts";
                    break;
                case 4:
                    tekst2 = "diamonds";
                    break;
                default:
                    tekst2 = "";
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

