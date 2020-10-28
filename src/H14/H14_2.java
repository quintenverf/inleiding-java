package H14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class H14_2 extends Applet {

    String kaart[] = {"Schoppen", "Harten", "Klaver", "ruiten"},
           number[] = {"aas", "heer", "vrouw", "boer", "tien", "negen", "acht", "zeven", "zes", "vijf", "vrier", "drie", "twee"};
    Button knop = new Button("deel kaart");
    boolean clicked;
    int getal, y, x, dertien;

    ArrayList<String> card = new ArrayList<>();

    public void init() {
        setSize(1000,1000);
        clicked = false;
        add(knop);
        knop.addActionListener(new knopListener());
        getal = 0;

    }
    public void paint(Graphics g) {

        g.drawString("player 1", 50, 50);
        g.drawString("player 2", 170,50);
        g.drawString("player 3", 290, 50);
        g.drawString("player 4", 410,50);
        for (int teller = 0; teller < 52; teller++) {
            if (teller == dertien) {x+=120;y=80;dertien +=13;}
            g.drawString(card.get(teller),x,y);
            y+= 20;
        }

    }

    class knopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
           x = 40;
           y = 80;
           dertien = 13;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 13; j++) {
                    card.add(kaart[i] + " " + number[j]);
                }
            }
            Collections.shuffle(card);
            repaint();
        }
    }
}
