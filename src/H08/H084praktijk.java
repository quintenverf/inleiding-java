package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H084praktijk extends Applet {

    TextField tekstvak1;
    TextField tekstvak2;
    Button gedeelddoor;
    Button keer;
    Button plus;
    Button min;
    double devide;
    double times;
    double add;
    double minus;
    double inkomst;
    double uitkomst;
    Label antwoord;

    public void init() {
        tekstvak1 = new TextField("", 10);
        add(tekstvak1);

        tekstvak2 = new TextField("", 10);
        add(tekstvak2);

        gedeelddoor = new Button(" / ");
        add(gedeelddoor);

        keer = new Button(" * ");
        add(keer);

        plus = new Button(" + ");
        add(plus);

        min = new Button(" - ");
        add(min);

        antwoord = new Label(" ");
        add(antwoord);

        uitkomst = 0.0;

        tekstvak1.addActionListener(new tekstvaklistener ());

    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        antwoord.setLocation(40,40);

        g.drawString(" " + antwoord,80,40);
    }
    class tekstvaklistener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            inkomst = Double.parseDouble(tekstvak1.getText());
            devide = (inkomst / uitkomst);
            repaint();

        }
    }

}

