package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H10_1 extends Applet {

    TextField tekstvak;
    Label label;
    String input;
    double inputgetal;
    double hoogstegetal;
    double uitkomst;

    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new Tekstvak() );
        input = "";
        label = new Label("type your highest number and press enter");

        // uitkomst = 0.0;
        add(tekstvak);
        add(label);

    }

    public void paint(Graphics g) {
        label.setLocation(40,40);

        g.drawString("antwoord " + uitkomst, 40,100);
        g.drawString(input, 40,80);


    }
    class Tekstvak implements ActionListener{
        public void actionPerformed(ActionEvent e) {
           input = tekstvak.getText();
           inputgetal = Double.parseDouble(input);
           if (inputgetal > hoogstegetal){
               hoogstegetal = inputgetal;
               uitkomst = hoogstegetal;
               repaint();
           }

        }
    }
}
