package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H12_praktijk extends Applet {
    String[] names = {"", "", "", "", "", "", "", "", "", "",};
    String[] phonenumbers = {"", "", "", "", "", "", "", "", "", "",};
    Button Knop = new Button("OK");
    TextField textvaknames = new TextField(10);
    TextField textvaknumbers = new TextField(10);
    int y = 50;
    int teller = 0;
    boolean paintaction = true;

    public void init() {
        add(textvaknames);
        add(textvaknumbers);
        add(Knop);
        Knop.addActionListener(new knopListener());
    }

    public void paint(Graphics g) {
        if (paintaction == true) ;{
            return;
        }
        for (int teller = 0; teller < names.length; teller++) {
            g.drawString("" + names[teller] + "" + phonenumbers[teller],50,y);
            y += 20;
        }
    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            names[teller] = textvaknames.getText();
            phonenumbers[teller] = textvaknumbers.getText();
            teller ++;
            if (teller == 10) {
                paintaction = false;
            }
            repaint();
            }
        }
    }
}
