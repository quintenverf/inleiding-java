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
    double output;
    Label antwoord;

    public void init() {
        tekstvak1 = new TextField("", 10);
        add(tekstvak1);

        tekstvak2 = new TextField("", 10);
        add(tekstvak2);

        gedeelddoor = new Button(" / ");
        add(gedeelddoor);
        gedeelddoor.addActionListener( new gedeelddoorvaklistener() );

        keer = new Button(" * ");
        add(keer);
        keer.addActionListener(new keervaklistener());

        plus = new Button(" + ");
        add(plus);
        plus.addActionListener(new keervaklistener());

        min = new Button(" - ");
        add(min);
        min.addActionListener(new minvaklistener());


        antwoord = new Label(" ");
        add(antwoord);

        uitkomst = 0.0;
        inkomst = 0.0;

        tekstvak1.addActionListener(new keervaklistener());

    }

    public void paint(Graphics g) {
       // setBackground(Color.black);
        antwoord.setLocation(40,40);

        g.drawString(" antwoord " + output,80,40);
    }
    class keervaklistener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            inkomst = Double.parseDouble(tekstvak1.getText());
            uitkomst = Double.parseDouble(tekstvak2.getText());
            output = inkomst *uitkomst;
            tekstvak1.setText("" + output);
            tekstvak2.setText("");
              //  repaint();
        }
    }
    class gedeelddoorvaklistener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            inkomst = Double.parseDouble(tekstvak1.getText());
            uitkomst = Double.parseDouble(tekstvak2.getText());
            output = inkomst /uitkomst;
            tekstvak1.setText("" + output);
            tekstvak2.setText("");
                //repaint();
        }
    }
    class plusvaklistener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            inkomst = Double.parseDouble(tekstvak1.getText());
            uitkomst = Double.parseDouble(tekstvak2.getText());
            output = inkomst +uitkomst;
            tekstvak1.setText("" + output);
            tekstvak2.setText("");
                //repaint();
        }
    }
    class minvaklistener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            inkomst = Double.parseDouble(tekstvak1.getText());
            uitkomst = Double.parseDouble(tekstvak2.getText());
            output = inkomst -uitkomst;
            tekstvak1.setText("" + output);
            tekstvak2.setText("");
                //repaint();
        }
    }

}

