package H13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H13_3 extends Applet {
    Button knopRood = new Button("RED");
    Button knopZwart = new Button("BLACK");


    public void init() {
        add(knopRood);
        knopRood.setBackground(Color.red);
        add(knopZwart);
        knopZwart.setBackground(Color.black);

        knopRood.addActionListener(new knopRoodListener());
        knopZwart.addActionListener(new knopZwartListener());
    }
    public void paint(Graphics g) {

    }
    class knopRoodListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

        }
    }
    class knopZwartListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

        }
    }
}
