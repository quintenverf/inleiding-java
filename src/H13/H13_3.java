package H13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H13_3 extends Applet {
    Button knopRood = new Button("");
    Button knopZwart = new Button("");
    int rood;
    int zwart;
    boolean clicked;
    Color color;


    public void init() {
        clicked = false;
        knopRood.setBackground(Color.red);
        knopRood.setSize(20,10);
        knopZwart.setBackground(Color.black);
        knopZwart.setSize(20,10);
        add(knopRood);
        add(knopZwart);

        knopRood.addActionListener(new knopRoodListener());
        knopZwart.addActionListener(new knopZwartListener());
    }
    public void paint(Graphics quinten) {
        if (clicked == true){
            int x = 0, y = 0, width = 40, height = 20;
            quinten.setColor(color);
            for (int tellerHorizontal = 25; tellerHorizontal > 0; tellerHorizontal--) {
                for (int tellervertical = 0; tellervertical < 25; tellervertical++) {
                    quinten.setColor(color);
                    quinten.fillRect(x, y, width, height);
                    quinten.setColor(color);
                    quinten.drawRect(x, y, width, height);
                    x += width;
                }
                y += 21;
                x = 1;
            }
        }
    }
    class knopRoodListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            color = Color.red;
            clicked = true;
            repaint();
        }
    }
    class knopZwartListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            color = Color.black;
            clicked = true;
            repaint();
        }
    }
}
