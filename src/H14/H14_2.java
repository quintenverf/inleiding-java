package H14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class H14_2 extends Applet {

    String[] deck;
    Button knop = new Button("deel kaart");
    boolean clicked;

    public void init() {
        setSize(1000,1000);
        clicked = false;
        add(knop);
        knop.addActionListener(new knopListener());

    }
    public void paint(Graphics g) {
        if (clicked == true){
            deelKaart();
        }
    }

    class knopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if (clicked == true);
            repaint();
        }
    }

    private String deelKaart() {
        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];

        //vervang de inhoud van deck met een nieuwe lijst
        //het nieuwe deck is 1 kaart kleiner dan het oude deck
        String[] hulpLijst = new String[deck.length - 1];
        //om het nieuwe deck te vullen hebben we een index nodig
        int hulpindex = 52;
        //kopieer alle kaarten naar hulplijst behalve de kaart die net gedeeld is
        for (int teller = 0; teller < deck.length; teller++) {
            if (teller != random) {
                hulpLijst[hulpindex] = deck[teller];
                hulpindex++;
            }
        }
        //vervang nu deck met de nieuwe lijst
        deck = hulpLijst;
        //de methode geeft de random kaart terug
        return kaart;
    }
}
