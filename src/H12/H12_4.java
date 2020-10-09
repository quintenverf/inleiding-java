package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H12_4 extends Applet {
    double inputdouble;
    boolean typed = true;
    boolean found;
    int index = 0;
    String string = "";
    TextField tekstvak = new TextField("", 10);
    Button button = new Button("OK");
    double[] numbers = { 3.1, 4.1, 59, 26, 53, 5.9};

    public void init() {
        add(tekstvak);
        add(button);
        button.addActionListener(new knopListener() );
    }
    public void paint(Graphics g) {
        if (typed == true){return;}
        found = false;
        int teller = 0;
        while (teller < numbers.length){
            if (numbers[teller] == inputdouble) {
                found = true;
                index = teller;
            }
            teller++;
        }
        if (found == true){
            g.drawString("uw waarde is gevonden. "+ index, 20,50);
        }
        else {
            g.drawString("uw waarde is niet gevonden. " + index, 40,50);
        }
    }

        class knopListener implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                typed = false;
                string = tekstvak.getText();
                inputdouble = Double.parseDouble(string);
                repaint();
            }
        }
    }

