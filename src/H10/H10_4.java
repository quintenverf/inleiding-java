package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H10_4 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int dag;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type in the month number " + " or " + " the year 2016 till 2020.");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 80 );
    }
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            dag = Integer.parseInt( s);
            switch(dag) {
                case 1:
                    tekst = "january " + " 31 days";
                    break;
                case 2:
                    tekst = "februari " + " 28/29 days";
                    break;
                case 3:
                    tekst = "march " + " 31 days";
                    break;
                case 4:
                    tekst = "april " + " 30 days";
                    break;
                case 5:
                    tekst = "may " + " 31 days";
                    break;
                case 6:
                    tekst = "june " + " 30 days";
                    break;
                case 7:
                    tekst = "juli " + " 31 days";
                    break;
                case 8:
                    tekst = "august " + " 31 days";
                    break;
                case 9:
                    tekst = "september " + " 30 days";
                    break;
                case 10:
                    tekst = "october " + " 31 days";
                    break;
                case 11:
                    tekst = " november " + " 30 days";
                    break;
                case 12:
                    tekst = " december " + " 31 days";
                    break;
                case 2016:
                    tekst = " is a leap year ";
                    break;
                case 2017:
                    tekst = " NOT a leap year ";
                    break;
                case 2018:
                    tekst = " NOT a leap year ";
                    break;
                case 2019:
                    tekst = " NOT a leap year ";
                    break;
                case 2020:
                    tekst = " yes, this year was a leap year ";
                    break;
                default:
                    tekst = " the number you typed doesn't exist ..!";
                    break;
            }
            repaint();

        }
    }
}
// TODO vraag hoe je zinnen onder elkaar krijgt..!!
